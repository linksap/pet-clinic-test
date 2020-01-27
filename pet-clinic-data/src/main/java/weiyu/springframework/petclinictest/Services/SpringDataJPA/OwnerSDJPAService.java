package weiyu.springframework.petclinictest.Services.SpringDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Owner;
import weiyu.springframework.petclinictest.Repositories.OwnerRepository;
import weiyu.springframework.petclinictest.Repositories.PetRepository;
import weiyu.springframework.petclinictest.Repositories.PetTypeRepository;
import weiyu.springframework.petclinictest.Services.OwnerService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
@Profile("SpringDataJPA")
public class OwnerSDJPAService implements OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerSDJPAService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;

    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner>owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner>optionalOwner= ownerRepository.findById(aLong);
        if (optionalOwner.isPresent()){
            return optionalOwner.get();
        }
        else {
            return null;
        }
    }

    @Override
    public Owner save(Owner Object) {
        return ownerRepository.save(Object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);

    }
}
