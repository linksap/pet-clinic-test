package weiyu.springframework.petclinictest.Services.SpringDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Vet;
import weiyu.springframework.petclinictest.Repositories.VetRepository;
import weiyu.springframework.petclinictest.Services.VetService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("SpringDataJPA")
public class VetSDJPAService implements VetService {
    private final VetRepository vetRepository;

    public VetSDJPAService(VetRepository VetRepository) {
        this.vetRepository = VetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set <Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet Object) {
        return vetRepository.save(Object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);

    }
}
