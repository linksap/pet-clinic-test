package weiyu.springframework.petclinictest.Services.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import weiyu.springframework.petclinictest.Models.Owner;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
    OwnerServiceMap ownerServiceMap;
    Long id = 1L;
    final  String lastName = "Weiyu";
    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        Owner owner = new Owner();
        owner.setId(id);
        owner.setLastName(lastName);
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerServiceMap.findAll();
        assertEquals(1,owners.size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(id);
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(id));
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner2 = new Owner();
        owner2.setId(id);
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertEquals(id,savedOwner.getId());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(id);
        assertEquals(id,owner.getId());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerServiceMap.findByLastName(lastName);
        assertNotNull(owner);
        assertEquals(id,owner.getId());
    }
}