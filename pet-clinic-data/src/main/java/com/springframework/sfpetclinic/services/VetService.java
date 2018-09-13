package com.springframework.sfpetclinic.services;

import com.springframework.sfpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Jaison on 09/13/2018
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
