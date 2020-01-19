package weiyu.springframework.petclinictest.Services.Map;

import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Speciality;
import weiyu.springframework.petclinictest.Services.SpecialtyService;

import java.util.Set;
@Service
public class SpecialtyMapService extends AbstractMapService <Speciality, Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}