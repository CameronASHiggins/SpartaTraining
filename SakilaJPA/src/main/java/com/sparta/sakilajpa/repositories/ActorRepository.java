package com.sparta.sakilajpa.repositories;

import com.sparta.sakilajpa.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}