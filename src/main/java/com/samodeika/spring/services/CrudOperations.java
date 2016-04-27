package com.samodeika.spring.services;

import java.util.List;

public interface CrudOperations<T> {

    List<T> getAll();
    T getById(long id);
    void save(T entity);
    boolean delete(T entity);
    boolean delete(long id);

}
