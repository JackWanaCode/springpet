package com.springframwork.springpet.bootstrap;

import com.springframwork.springpet.model.Owner;
import com.springframwork.springpet.model.Vet;
import com.springframwork.springpet.services.OwnerService;
import com.springframwork.springpet.services.VetService;
import com.springframwork.springpet.services.map.OwnerServiceMap;
import com.springframwork.springpet.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("First1");
        owner1.setLastName("Last1");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("First2");
        owner2.setLastName("Last2");

        ownerService.save(owner2);

        System.out.println("Loading owners");

        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstName("First3");
        vet1.setLastName("Last3");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstName("First2");
        vet2.setLastName("Last2");

        vetService.save(vet2);

        System.out.println("Loading vets");

    }
}
