package com.sparta.sakilajpa.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sparta.sakilajpa.entities.Actor;
import com.sparta.sakilajpa.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class SakilaApiController {
    @Autowired
    private ActorRepository actorRepo;

    // method mapped onto /sakila/hello
    @GetMapping("/sakila/hello")
    public String sayHello(){
        return "<h1>Hello, world!</h1>";
    }

    @GetMapping("/sakila/newActor")
    public Actor returnActor(){
        Actor actor = new Actor();
        actor.setFirstName("Yash");
        actor.setLastName("Jagani");
        actor.setId(1234);
        return actor;
    }

    @GetMapping("/sakila/newActors")
    public List<Actor> returnActors(){
        Actor actor = new Actor();
        actor.setFirstName("Yash");
        actor.setLastName("Jagani");
        actor.setId(1234);
        Actor actor2 = new Actor();
        actor2.setFirstName("Hanibal");
        actor2.setLastName("Brhanu");
        actor2.setId(4321);
        List<Actor> result = new ArrayList<>();
        result.add(actor);
        result.add(actor2);
        return result;
    }

    @GetMapping("sakila/actors/testRead")
    public Actor findActor15(){
        Optional<Actor> result = actorRepo.findById(15);
        Actor cuba = result.get();
        return cuba;
    }

//    @GetMapping("sakila/actors/{id}")
//    public Actor findActor(@PathVariable int id){
//        Optional<Actor> result = actorRepo.findById(id);
//        Actor actor = result.get();
//        return actor;
//    }

    @GetMapping("sakila/actors/{id}")
    public ResponseEntity<String> findById(@PathVariable int id){
        Optional<Actor> result = actorRepo.findById(id);
        ObjectMapper actorMapper = JsonMapper.builder()
                .addModule(new JavaTimeModule())
                .build();
        ResponseEntity<String> returnValue = null;
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        if(result.isPresent()){
            Actor actor = result.get();
            String actorString = null;
            try {
                actorString = actorMapper.writeValueAsString(actor);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
            returnValue = new ResponseEntity<>(actorString, headers, HttpStatus.OK);
        } else {
            returnValue = new ResponseEntity<>(
                    "{\"message\":\"Actor "+id+" not found\"}",
                    headers,
                    HttpStatus.NOT_FOUND);
        }
        return returnValue;
    }

    @DeleteMapping("sakila/actors/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id){
        Optional<Actor> result = actorRepo.findById(id);
        ResponseEntity<String> returnValue = null;
        if (result.isPresent()){
            actorRepo.deleteById(id);
            returnValue = new ResponseEntity<>("{\"message\":\"Actor: " + id + " deleted successfully\"}",HttpStatus.NO_CONTENT);
        } else {
            returnValue = new ResponseEntity<>("{\"message\":\"Actor: " + id + " not found\"}", HttpStatus.NOT_FOUND);
        }
        return returnValue;
    }

    @PostMapping("sakila/actors")
    public ResponseEntity<String> createActor(@RequestBody Actor newActor){
        ResponseEntity returnValue = null;
        if (actorRepo.findById(newActor.getId()).isEmpty()){
            if(newActor.getLastUpdate()==null){
                newActor.setLastUpdate(Instant.now());
            }
            actorRepo.save(newActor);
            returnValue = new ResponseEntity<>("{\"message\":\"Actor: " + newActor.getFirstName() + " " + newActor.getLastName() + " added successfully\"}",HttpStatus.CREATED);
        } else {
            returnValue = new ResponseEntity<>("{\"message\":\"Actor already exists \"}",HttpStatus.FORBIDDEN);
        }

        return returnValue;
    }

    @PatchMapping("sakila/actors")
    public ResponseEntity<String> updateActor(@RequestBody Actor newState){
        Actor original = null;
        ResponseEntity returnValue = null;
        Optional<Actor> originalOptional = actorRepo.findById(newState.getId());
        if (originalOptional.isPresent()){
            original = originalOptional.get();
            if (newState.getFirstName()!= null)
                original.setFirstName(newState.getFirstName());
            if (newState.getLastName()!= null)
                original.setLastName(newState.getLastName());
            original.setLastUpdate(Instant.now());
            actorRepo.save(original);
            returnValue = new ResponseEntity<>("{\"message\":\"Actor updated successfully\"}",HttpStatus.ACCEPTED);
        } else{
            returnValue = new ResponseEntity<>("{\"message\":\"Actor update failed\"}",HttpStatus.NOT_FOUND);
        }

        return returnValue;
    }

    @PutMapping("sakila/actors")
    public ResponseEntity updateActorPut(@RequestBody Actor newState){
        Actor original = null;
        ResponseEntity returnValue = null;
        Optional<Actor> originalOptional = actorRepo.findById(newState.getId());
        if (originalOptional.isPresent()){
            original = originalOptional.get();
            if (newState.getFirstName()!= null)
                original.setFirstName(newState.getFirstName());
            if (newState.getLastName()!= null)
                original.setLastName(newState.getLastName());
            original.setLastUpdate(Instant.now());
            actorRepo.save(original);
            returnValue = new ResponseEntity<>("{\"message\":\"Actor updated successfully\"}",HttpStatus.PARTIAL_CONTENT);
        } else{
            newState.setLastUpdate(Instant.now());
            actorRepo.save(newState);
            returnValue = new ResponseEntity<>("{\"message\":\"Actor added successfully\"}",HttpStatus.CREATED);
        }
        return returnValue;
    }

    @GetMapping("sakila/actors")
    public Actor findActorParam(@RequestParam int id, @RequestParam String firstName){
        System.out.println(firstName);
        Optional<Actor> result = actorRepo.findById(id);
        Actor actor = result.get();
        return actor;
    }

    @ExceptionHandler
    public String reportError(Throwable t){
        System.out.println(t);
        return "<h1>Error! You messed up.</h1>";
    }
}