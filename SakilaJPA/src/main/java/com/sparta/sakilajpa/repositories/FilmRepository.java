package com.sparta.sakilajpa.repositories;

import com.sparta.sakilajpa.entities.Film;
import com.sparta.sakilajpa.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    List<Film> findByLanguage(Language language);
}