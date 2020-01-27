package weiyu.springframework.petclinictest.Services.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Owner;
import weiyu.springframework.petclinictest.Models.Pet;
import weiyu.springframework.petclinictest.Services.OwnerService;
import weiyu.springframework.petclinictest.Services.PetService;
import weiyu.springframework.petclinictest.Services.PetTypeService;

import java.util.Set;
@Service
@Profile("Default")
public class OwnerServiceMap extends AbstractMapService <Owner ,Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
            super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        Owner savedOwner = null;
        if (owner != null) {
            if (owner.getPets() != null) {
                owner.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if (pet.getPetType().getId() ==null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }
                    else {
                        throw new RuntimeException("Pet Type is required");
                    }
                    if (pet.getId()==null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return  super.save(owner);
        }
        else {
            return  null;
        }


    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        for (Owner o : super.map.values()){
            if (o.getLastName() == lastName){
                return o;
            }
        }
        return null;
    }
}
