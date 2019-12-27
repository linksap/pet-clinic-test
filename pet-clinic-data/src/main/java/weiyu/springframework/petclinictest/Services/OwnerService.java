package weiyu.springframework.petclinictest.Services;

import weiyu.springframework.petclinictest.Models.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save (Owner owner);
    Set<Owner> findAll();
}
