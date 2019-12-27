package weiyu.springframework.petclinictest.Services;

import weiyu.springframework.petclinictest.Models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save (Pet pet);
    Set<Pet> findAll();
}
