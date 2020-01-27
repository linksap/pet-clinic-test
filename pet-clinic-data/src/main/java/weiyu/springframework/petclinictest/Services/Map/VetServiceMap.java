package weiyu.springframework.petclinictest.Services.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Speciality;
import weiyu.springframework.petclinictest.Models.Vet;
import weiyu.springframework.petclinictest.Services.SpecialtyService;
import weiyu.springframework.petclinictest.Services.VetService;

import java.util.Set;
@Service
@Profile("Default")
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }

    @Override
    public Vet save(Vet vet) {
        if (vet.getSpecialities().size()>0){
            vet.getSpecialities().forEach(speciality -> {
                if (speciality.getId()==null){
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet findById(Long id) {
        return findById(id);
    }
}
