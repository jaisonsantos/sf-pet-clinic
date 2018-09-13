package com.springframework.sfpetclinic.services;

import com.springframework.sfpetclinic.model.Owner;

/**
 * Created by Jaison on 09/13/2018
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
