package com.samodeika.spring.services;

import java.util.List;

public interface CrudOperations<T> {

    List<T> getAll();
    T getById(Long id);
    void save(T entity);

}
