package weiyu.springframework.petclinictest.Services.SpringDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Speciality;
import weiyu.springframework.petclinictest.Repositories.SpecialityRepository;
import weiyu.springframework.petclinictest.Services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")

public class SpecialitySDJPAService implements SpecialtyService {
    private final SpecialityRepository specialityRepository;

    public SpecialitySDJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set <Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality Object) {
        return specialityRepository.save(Object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
