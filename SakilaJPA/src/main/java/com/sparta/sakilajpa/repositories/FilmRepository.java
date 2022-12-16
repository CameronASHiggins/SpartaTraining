package com.sparta.sakilajpa.repositories;

import com.sparta.sakilajpa.entities.Film;
import com.sparta.sakilajpa.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    List<Film> findByLanguage(Language language);

    List<Film> findByTitleStartingWith(String prefix);

    List<Film> findByTitleStartingWithAndTitleEndingWith(String prefix,String suffix);

    //Using parameterised JPQL query
    @Query("SELECT f FROM Film f where f.length > :movieLength")
    List<Film> findLongFilmsJPQL(int movieLength);
    @Query(value = "SELECT * FROM film where film.length > :movieLength", nativeQuery = true)
    List<Film> findLongFilmsSQL(int movieLength);

}