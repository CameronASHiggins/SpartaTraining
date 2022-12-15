package com.sparta.sakilajpa;

import com.sparta.sakilajpa.entities.Category;
import com.sparta.sakilajpa.repositories.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.Optional;

@SpringBootTest
@Transactional
public class SakilaJpaCreateEntitiesTests {

    @Autowired
    private CategoryRepository catergoryRepo;

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
        Category result = catergoryRepo.save(newCategory);
        System.out.println(result);
        Optional<Category> found = catergoryRepo.findById(result.getId());
        System.out.println(found.get());
        Category foundCategory = found.get();
        Assertions.assertEquals("Anime",foundCategory.getName());
    }


}
