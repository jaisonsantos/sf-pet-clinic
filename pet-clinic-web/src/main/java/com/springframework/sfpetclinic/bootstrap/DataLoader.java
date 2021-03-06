package com.springframework.sfpetclinic.bootstrap;

import com.springframework.sfpetclinic.model.Owner;
import com.springframework.sfpetclinic.model.Vet;
import com.springframework.sfpetclinic.services.OwnerService;
import com.springframework.sfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Jaison on 09/19/2018
 */
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
        owner1.setFirstName("Jaison");
        owner1.setLastName("Santos");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Leandro");
        owner2.setLastName("Quintero");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Lemman");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Connor");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
