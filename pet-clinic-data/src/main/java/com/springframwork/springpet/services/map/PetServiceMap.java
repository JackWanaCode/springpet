package com.springframwork.springpet.services.map;

import com.springframwork.springpet.model.Pet;
import com.springframwork.springpet.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstrackMapService<Pet, Long> implements PetService {

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
