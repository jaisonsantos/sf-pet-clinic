package com.springframework.sfpetclinic.services.map;

import com.springframework.sfpetclinic.model.Vet;
import com.springframework.sfpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by Jaison on 09/13/2018
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
