package com.springframework.sfpetclinic.services.map;

import com.springframework.sfpetclinic.model.Owner;
import com.springframework.sfpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Jaison on 09/13/2018
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
