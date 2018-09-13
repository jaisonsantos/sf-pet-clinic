package com.springframework.sfpetclinic.services;

import java.util.Set;

/**
 * Created by Jaison on 09/13/2018
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(Long id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
