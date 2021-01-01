package com.springframwork.springpet.services;

import com.springframwork.springpet.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
