package weiyu.springframework.petclinictest.Repositories;

import org.springframework.data.repository.CrudRepository;
import weiyu.springframework.petclinictest.Models.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
