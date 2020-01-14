package weiyu.springframework.petclinictest.BootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import weiyu.springframework.petclinictest.Models.Owner;
import weiyu.springframework.petclinictest.Models.Vet;
import weiyu.springframework.petclinictest.Services.OwnerService;
import weiyu.springframework.petclinictest.Services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Weiyu");
        owner1.setLastName("Liu");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setFirstName("limin");
        owner2.setLastName("zhu");
        ownerService.save(owner2);
        System.out.println("Loading owners");
        Vet vet1 = new Vet();
        vet1.setFirstName("b");
        vet1.setLastName("Z");
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setFirstName("GOU");
        vet2.setLastName("YAO");
        vetService.save(vet2);
        System.out.println("Loading vets");



    }
}
