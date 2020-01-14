package weiyu.springframework.petclinictest.Services.Map;

import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Vet;
import weiyu.springframework.petclinictest.Services.VetService;

import java.util.Set;
@Service
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
