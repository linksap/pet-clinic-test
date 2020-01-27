package weiyu.springframework.petclinictest.Services.SpringDataJPA;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import weiyu.springframework.petclinictest.Models.PetType;
import weiyu.springframework.petclinictest.Repositories.PetTypeRepository;
import weiyu.springframework.petclinictest.Services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class PetTypeSDJPAService implements PetTypeService {
    private  final PetTypeRepository petTypeRepository;

    public PetTypeSDJPAService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set <PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType Object) {
        return petTypeRepository.save(Object);
    }

    @Override
    public void delete(PetType object) {
         petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
