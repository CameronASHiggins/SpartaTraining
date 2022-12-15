package com.sparta.sakilajpa.repositories;

import com.sparta.sakilajpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Short> {
}