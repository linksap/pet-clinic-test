package weiyu.springframework.petclinictest.BootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import weiyu.springframework.petclinictest.Models.*;
import weiyu.springframework.petclinictest.Services.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count==0){
            loadData();
        }


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setType("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setType("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Speciality radiology =new Speciality();
        radiology.setDescription("radiology");
        Speciality savedRadiology = specialtyService.save(radiology);
        Speciality surgery =new Speciality();
        radiology.setDescription("surgery");
        Speciality savedSurgery = specialtyService.save(surgery);
        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry= specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Weiyu");
        owner1.setLastName("Liu");
        owner1.setAddress("1123 avc");
        owner1.setCity("Atlanta");
        owner1.setCellphone("12345");


        Owner owner2 = new Owner();
        owner2.setFirstName("limin");
        owner2.setLastName("zhu");
        owner2.setAddress("12312 sdc");
        owner2.setCity("Miami");
        owner2.setCellphone("13245");



        System.out.println("Loading owners");

        Pet willPet = new Pet();
        willPet.setPetType(savedCatType);
        willPet.setOwner(owner1);
        willPet.setBirthday(LocalDate.now());
        willPet.setName("Toby");
        owner1.getPets().add(willPet);
        ownerService.save(owner1);

        Pet liminPet = new Pet();
        liminPet.setPetType(savedDogType);
        liminPet.setOwner(owner2);
        liminPet.setBirthday(LocalDate.now());
        liminPet.setName("da");
        owner2.getPets().add(liminPet);
        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(willPet);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("dialoma");
        visitService.save(catVisit);

        Vet vet1 = new Vet();
        vet1.setFirstName("b");
        vet1.setLastName("Z");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("GOUhjhj");
        vet2.setLastName("YAO");
        vet2.getSpecialities().add(savedDentistry);
        vetService.save(vet2);

        System.out.println("Loading vets");
    }
}
