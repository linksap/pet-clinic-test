package weiyu.springframework.petclinictest.Services.Map;

import com.sun.xml.bind.v2.model.core.ID;
import weiyu.springframework.petclinictest.Models.Pet;
import weiyu.springframework.petclinictest.Services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService <Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
