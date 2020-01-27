package weiyu.springframework.petclinictest.Services.SpringDataJPA;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Visit;
import weiyu.springframework.petclinictest.Repositories.VisitRepository;
import weiyu.springframework.petclinictest.Services.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class VisitSDJPAService implements VisitService {

    private final  VisitRepository visitRepository;

    public VisitSDJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set <Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit Object) {
         return visitRepository.save(Object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
