package com.springframwork.springpet.services;

import com.springframwork.springpet.model.Owner;
import com.springframwork.springpet.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
