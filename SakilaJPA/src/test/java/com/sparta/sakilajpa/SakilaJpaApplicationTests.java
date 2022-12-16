package com.sparta.sakilajpa;

import com.sparta.sakilajpa.entities.*;
import com.sparta.sakilajpa.repositories.*;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Optional;


@SpringBootTest
@Rollback(false)
@Transactional
class SakilaJpaApplicationTests {
    @Autowired
    private ActorRepository repoActor;

    @Autowired
    private FilmRepository repoFilm;
    @Autowired
    private StaffRepository repoStaff;

    @Autowired
    private LanguageRepository repoLang;
    @Test
    void contextLoads() {
    }

    @Test
    void testActorFindById(){
        Optional<Actor> result = repoActor.findById(15);
        if(result.isPresent()){
            // we do have an actor
            Actor cuba = result.get();
            System.out.println(cuba);
            Assertions.assertEquals("CUBA",cuba.getFirstName());
            Assertions.assertEquals("OLIVIER",cuba.getLastName());
        } else {
            Assertions.fail();
        }
    }

    @Test
    void testActorDeleteActor(){
        Optional<Actor> resultBeforeDelete = repoActor.findById(210);
        if(resultBeforeDelete.isEmpty()) Assertions.assertTrue(true);
        else{
        repoActor.deleteById(210);
        Optional<Actor> resultAfterDelete = repoActor.findById(210);
        Assertions.assertFalse(resultAfterDelete.isPresent());}
    }

    @Test
    void testActorFindAll(){
        List<Actor> result = repoActor.findAll();
        for (Actor a: result) {
            System.out.println(a);
        }
    }

    @Test
    void testActorFindByLastName(){
        List<Actor> result = repoActor.findByLastName("CAGE");
        System.out.println(result);
        Assertions.assertTrue(!result.isEmpty());
    }

    @Test
    void testActorUpdateActor(){
        Actor newActor = new Actor();
        newActor.setId(210);
        newActor.setFirstName("CAMERON");
        newActor.setLastName("HIGGINS");
        newActor.setLastUpdate(Instant.now());
        repoActor.save(newActor);
    }

    @Test
    void testFilmFindById(){
        Optional<Film> result = repoFilm.findById(10);
        if(result.isPresent()){
            // we do have a film
            Film aladdin  = result.get();
            System.out.println(aladdin);
            Assertions.assertEquals("ALADDIN CALENDAR",aladdin.getTitle());
        } else {
            Assertions.fail();
        }

    }

    @Test
    void testFilmFindByLanguage(){
        List<Film> result = repoFilm.findByLanguage(repoLang.findByName("Japanese").get(0));
        for (Film f: result) {
            System.out.println(f.getTitle());
        }
        Assertions.assertTrue(!result.isEmpty());
    }

    @Test
    void testStaffRelationship(){
        Optional<Staff> mikeOpt = repoStaff.findById((short)1);
        Staff mike = mikeOpt.get();
        Address mikesAddress = mike.getAddress();
        String district = mikesAddress.getDistrict();
        Assertions.assertEquals("Alberta",district);
    }

}
