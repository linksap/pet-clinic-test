package weiyu.springframework.petclinictest.Services.Map;

import com.sun.xml.bind.v2.model.core.ID;
import weiyu.springframework.petclinictest.Models.Owner;
import weiyu.springframework.petclinictest.Services.CrudService;
import weiyu.springframework.petclinictest.Services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService <Owner ,Long> implements OwnerService {
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
        return  super.save(owner.getId(),owner);
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
