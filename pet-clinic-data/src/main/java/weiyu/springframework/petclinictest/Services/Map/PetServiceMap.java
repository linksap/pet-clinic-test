package weiyu.springframework.petclinictest.Services.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Pet;
import weiyu.springframework.petclinictest.Services.PetService;

import java.util.Set;
@Service
@Profile("Default")
public class PetServiceMap extends AbstractMapService <Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
