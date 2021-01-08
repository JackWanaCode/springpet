package com.springframwork.springpet.bootstrap;

import com.springframwork.springpet.model.Owner;
import com.springframwork.springpet.model.Vet;
import com.springframwork.springpet.services.OwnerService;
import com.springframwork.springpet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


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
        owner1.setFirstName("First1");
        owner1.setLastName("Last1");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("First2");
        owner2.setLastName("Last2");

        ownerService.save(owner2);

        System.out.println("Loading owners");

        Vet vet1= new Vet();
        vet1.setFirstName("First3");
        vet1.setLastName("Last3");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("First2");
        vet2.setLastName("Last2");

        vetService.save(vet2);

        System.out.println("Loading vets");

    }
}
