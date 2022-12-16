package com.sparta.sakilajpa;

import com.sparta.sakilajpa.entities.Actor;
import com.sparta.sakilajpa.repositories.ActorRepository;
import com.sparta.sakilajpa.repositories.CategoryRepository;
import com.sparta.sakilajpa.repositories.FilmRepository;
import com.sparta.sakilajpa.repositories.LanguageRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.time.Instant;

@SpringBootTest
@Commit
@Transactional
public class SakilaJpaUpdateEntitiesTests {

    @Autowired
    private LanguageRepository repoLang;
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private ActorRepository repoActor;
    @Autowired
    private FilmRepository repoFilm;

    @Test
    void testActorUpdateActor(){
        Actor newActor = new Actor();
        newActor.setId(210);
        newActor.setFirstName("CAMERON");
        newActor.setLastName("HIGGINS");
        newActor.setLastUpdate(Instant.now());
        repoActor.save(newActor);
    }
}
