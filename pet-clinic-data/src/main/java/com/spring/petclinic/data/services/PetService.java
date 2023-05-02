package com.spring.petclinic.data.services;

import com.spring.petclinic.data.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
