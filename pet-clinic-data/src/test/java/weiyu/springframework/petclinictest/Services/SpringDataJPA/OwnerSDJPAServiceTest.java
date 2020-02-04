package weiyu.springframework.petclinictest.Services.SpringDataJPA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import weiyu.springframework.petclinictest.Models.Owner;
import weiyu.springframework.petclinictest.Repositories.OwnerRepository;
import weiyu.springframework.petclinictest.Repositories.PetRepository;
import weiyu.springframework.petclinictest.Repositories.PetTypeRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJPAServiceTest {
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;
    @InjectMocks
    OwnerSDJPAService ownerSDJPAService;
    private final String lastname = "weiyu";
    Owner test1;
    @BeforeEach
    void setUp() {
        test1 = new Owner();
        test1.setId(1L);
        test1.setLastName(lastname);
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(test1);
        Owner weiyu = ownerSDJPAService.findByLastName(lastname);
        assertEquals(lastname, weiyu.getLastName());
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> owners = new HashSet<>();
        Owner test1 = new Owner();
        test1.setId(2L);
        Owner test2 = new Owner();
        test1.setId(3L);
        owners.add(test1);
        owners.add(test2);
        when(ownerRepository.findAll()).thenReturn(owners);
        Set <Owner> owners1 =ownerSDJPAService.findAll();
        assertNotNull(owners1);
        assertEquals(2,owners1.size());


    }

    @Test
    void findById() {
        Owner test4 = new Owner();
        test4.setLastName("l");
        test4.setId(4L);
        when(ownerRepository.findById(4L)).thenReturn(Optional.of(test4));
        Owner owner = ownerSDJPAService.findById(4L);
        assertNotNull(owner);

    }

    @Test
    void save() {
        when((ownerRepository.save(any()))).thenReturn(test1);
        Owner savedOwner = ownerSDJPAService.save(test1);
        assertNotNull(savedOwner);
    }

    @Test
    void delete() {
        ownerSDJPAService.delete(test1);
        Set <Owner> owners = ownerSDJPAService.findAll();
        assertEquals(0,owners.size());
    }

    @Test
    void deleteById() {
        ownerSDJPAService.deleteById(test1.getId());
        verify(ownerRepository).deleteById(anyLong());
    }
}