package weiyu.springframework.petclinictest.Services.Map;

import com.sun.xml.bind.v2.model.core.ID;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.PetType;
import weiyu.springframework.petclinictest.Services.PetTypeService;

import java.util.Set;
@Service
public class PetTypeMapService extends AbstractMapService <PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
