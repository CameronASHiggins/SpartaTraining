package com.sparta.sakilajpa;

import com.sparta.sakilajpa.entities.Actor;
import com.sparta.sakilajpa.repositories.ActorRepository;
import com.sparta.sakilajpa.repositories.CategoryRepository;
import com.sparta.sakilajpa.repositories.FilmRepository;
import com.sparta.sakilajpa.repositories.LanguageRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@SpringBootTest
@Commit
@Transactional
public class SakilaJpaDeleteEntitiesTests {

    @Autowired
    private LanguageRepository repoLang;
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private ActorRepository repoActor;
    @Autowired
    private FilmRepository repoFilm;

    @Test
    @Rollback(true)
    void testActorDeleteActor(){
        Optional<Actor> resultBeforeDelete = repoActor.findById(222);
        if(resultBeforeDelete.isEmpty()){
            System.out.println("Actor not found, no deletion necessary");
            Assertions.assertTrue(true);
        }
        else{
            System.out.println("Actor found, deletion commencing");
            repoActor.deleteById(222);
            Optional<Actor> resultAfterDelete = repoActor.findById(222);
            Assertions.assertFalse(resultAfterDelete.isPresent());}
    }

}