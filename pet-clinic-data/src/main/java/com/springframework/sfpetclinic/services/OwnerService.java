package com.springframework.sfpetclinic.services;

import com.springframework.sfpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Jaison on 09/13/2018
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
