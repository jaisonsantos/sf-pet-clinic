package com.springframework.sfpetclinic.services;

import com.springframework.sfpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Jaison on 09/13/2018
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
