package com.springframwork.springpet.services.map;

import com.springframwork.springpet.model.Owner;
import com.springframwork.springpet.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstrackMapService<Owner, Long> implements CrudService<Owner, Long> {

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
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
