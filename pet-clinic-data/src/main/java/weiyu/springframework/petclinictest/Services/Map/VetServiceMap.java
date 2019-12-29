package weiyu.springframework.petclinictest.Services.Map;

import weiyu.springframework.petclinictest.Models.Vet;
import weiyu.springframework.petclinictest.Services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
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
        return save(vet.getId(),vet);
    }

    @Override
    public void delete(Vet vet) {
        delete(vet);
    }

    @Override
    public Vet findById(Long id) {
        return findById(id);
    }
}
