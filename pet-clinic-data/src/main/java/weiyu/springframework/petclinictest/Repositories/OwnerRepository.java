package weiyu.springframework.petclinictest.Repositories;

import org.springframework.data.repository.CrudRepository;
import weiyu.springframework.petclinictest.Models.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);
}
