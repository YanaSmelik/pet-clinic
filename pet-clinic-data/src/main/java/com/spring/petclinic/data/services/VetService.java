package com.spring.petclinic.data.services;

import com.spring.petclinic.data.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
