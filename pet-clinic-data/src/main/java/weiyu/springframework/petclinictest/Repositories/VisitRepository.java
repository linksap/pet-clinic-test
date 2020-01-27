package weiyu.springframework.petclinictest.Repositories;

import org.springframework.data.repository.CrudRepository;
import weiyu.springframework.petclinictest.Models.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
