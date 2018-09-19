package com.springframework.sfpetclinic.services.map;

import com.springframework.sfpetclinic.model.Pet;
import com.springframework.sfpetclinic.services.PetService;

import java.util.Set;

/**
 * Created by Jaison on 09/13/2018
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
