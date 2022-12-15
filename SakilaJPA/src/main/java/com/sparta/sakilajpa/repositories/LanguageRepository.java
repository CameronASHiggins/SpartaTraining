package com.sparta.sakilajpa.repositories;

import com.sparta.sakilajpa.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language, Short> {

    List<Language> findByName (String name);

}