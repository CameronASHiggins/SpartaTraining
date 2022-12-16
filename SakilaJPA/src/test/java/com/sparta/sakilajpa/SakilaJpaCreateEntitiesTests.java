package com.sparta.sakilajpa;

import com.sparta.sakilajpa.entities.Actor;
import com.sparta.sakilajpa.entities.Category;
import com.sparta.sakilajpa.entities.Film;
import com.sparta.sakilajpa.entities.Language;
import com.sparta.sakilajpa.repositories.ActorRepository;
import com.sparta.sakilajpa.repositories.CategoryRepository;
import com.sparta.sakilajpa.repositories.FilmRepository;
import com.sparta.sakilajpa.repositories.LanguageRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Optional;

@SpringBootTest
@Rollback(false)
@Transactional
public class SakilaJpaCreateEntitiesTests {

    @Autowired
    private LanguageRepository repoLang;
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private ActorRepository repoActor;
    @Autowired
    private FilmRepository repoFilm;
    @Test
    void contextLoads() {
    }

    @Test
    void testCategoryCreateCategory(){
        Category newCategory = new Category();
        newCategory.setId((short)0);
        newCategory.setName("Anime");
        newCategory.setLastUpdate(Instant.now());
        System.out.println(newCategory);
        Category result = categoryRepo.save(newCategory);
        System.out.println(result);
        Optional<Category> found = categoryRepo.findById(result.getId());
        System.out.println(found.get());
        Category foundCategory = found.get();
        Assertions.assertEquals("Anime",foundCategory.getName());
    }
    @Test
    void testLanguageCreateLanguage(){
        Language newLanguage = new Language();
        newLanguage.setId((short)0);
        newLanguage.setName("Welsh");
        newLanguage.setLastUpdate(Instant.now());
        Language result = repoLang.save(newLanguage);
        System.out.println(result);
        Optional<Language> found = repoLang.findById(result.getId());
        System.out.println(found.get());
        Language foundLang = found.get();
        Assertions.assertEquals("Welsh",foundLang.getName());
    }


    @Test
    void testActorCreateActor(){
        Actor newActor = new Actor();
        newActor.setId(0);
        newActor.setFirstName("Cameron");
        newActor.setLastName("Higgins");
        newActor.setLastUpdate(Instant.now());
        System.out.println(newActor);
        Actor result = repoActor.save(newActor);
        System.out.println(result);
        Optional<Actor> found = repoActor.findById(result.getId());
        System.out.println(found.get());
        Actor foundActor = found.get();
        Assertions.assertEquals("Cameron",foundActor.getFirstName());
    }

    @Test
    void testFilmCreateFilm(){
        Film newFilm = new Film();
        newFilm.setId(0);
        newFilm.setTitle("WEATHERING WITH YOU");
        newFilm.setDescription("High-school boy runs away from his troubled rural home to Tokyo and befriends an orphan girl who can manipulate the weather");
        newFilm.setReleaseYear(2019);
        newFilm.setLanguage(repoLang.findById((short)3).get());
        newFilm.setRentalDuration((short) 7);
        newFilm.setRentalRate(new BigDecimal("4.99"));
        newFilm.setLength(114);
        newFilm.setReplacementCost(new BigDecimal("19.99"));
        newFilm.setRating("PG-13");
        newFilm.setSpecialFeatures("Trailers");
        newFilm.setLastUpdate(Instant.now());
        System.out.println(newFilm);
        Film result = repoFilm.save(newFilm);
        System.out.println(result);
        Optional<Film> found = repoFilm.findById(result.getId());
        System.out.println(found.get());
        Film foundFilm = found.get();
        Assertions.assertEquals("WEATHERING WITH YOU",foundFilm.getTitle());
    }
}
