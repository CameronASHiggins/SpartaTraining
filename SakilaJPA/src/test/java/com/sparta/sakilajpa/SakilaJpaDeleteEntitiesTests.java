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
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@SpringBootTest
@Rollback(false)
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
    void testActorDeleteActor(){
        Optional<Actor> resultBeforeDelete = repoActor.findById(210);
        if(resultBeforeDelete.isEmpty()) Assertions.assertTrue(true);
        else{
            repoActor.deleteById(210);
            Optional<Actor> resultAfterDelete = repoActor.findById(210);
            Assertions.assertFalse(resultAfterDelete.isPresent());}
    }

}