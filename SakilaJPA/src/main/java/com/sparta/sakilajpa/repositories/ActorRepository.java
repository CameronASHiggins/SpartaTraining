package com.sparta.sakilajpa.repositories;

import com.sparta.sakilajpa.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    @Transactional
    @Modifying
    @Query("update Actor a set a.firstName = ?1, a.lastName = ?2, a.lastUpdate = ?3 where a.id = ?4")
    int updateFirstNameAndLastNameAndLastUpdateById(String firstName, String lastName, Instant lastUpdate, Integer id);
    List<Actor> findByLastName(String lastName);
}