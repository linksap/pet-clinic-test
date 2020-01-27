package weiyu.springframework.petclinictest.Repositories;

import org.springframework.data.repository.CrudRepository;
import weiyu.springframework.petclinictest.Models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
