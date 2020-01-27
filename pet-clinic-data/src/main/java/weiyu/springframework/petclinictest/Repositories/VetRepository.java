package weiyu.springframework.petclinictest.Repositories;

import org.springframework.data.repository.CrudRepository;
import weiyu.springframework.petclinictest.Models.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
