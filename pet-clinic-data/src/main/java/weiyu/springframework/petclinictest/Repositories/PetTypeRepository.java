package weiyu.springframework.petclinictest.Repositories;

import org.springframework.data.repository.CrudRepository;
import weiyu.springframework.petclinictest.Models.PetType;

public interface PetTypeRepository extends CrudRepository <PetType, Long> {
}
