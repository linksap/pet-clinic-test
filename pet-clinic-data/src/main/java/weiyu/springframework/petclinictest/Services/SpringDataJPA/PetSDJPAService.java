package weiyu.springframework.petclinictest.Services.SpringDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Pet;
import weiyu.springframework.petclinictest.Repositories.PetRepository;
import weiyu.springframework.petclinictest.Services.PetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class PetSDJPAService implements PetService {
    private final PetRepository petRepository;

    public PetSDJPAService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set <Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet Object) {
        return petRepository.save(Object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
