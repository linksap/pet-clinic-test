package weiyu.springframework.petclinictest.Services.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weiyu.springframework.petclinictest.Models.Visit;
import weiyu.springframework.petclinictest.Services.VisitService;

import java.util.Set;
@Service
@Profile("Default")
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findall();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet()==null||visit.getPet().getOwner() ==null|| visit.getPet().getId()==null||visit.getPet().getOwner().getId()==null){
            throw  new  RuntimeException("Invalid");
        }
        else {
            return super.save(visit);
        }
        //return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
