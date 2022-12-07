package com.sparta.dao.interfaces;

/*
DAO Interface - CRUD Interface
We will have at least one method for each of: Create, Read, Update, Delete
 */

import java.util.List;

public interface DAO<T> {

    T findById (int id);

    int insert(T newRow);

    void delete(int id);

    void update(T update);

    List<T> findAll();
}
