package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
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
        owner1.setFirstName("John");
        owner1.setLastName("Cena");
        owner1.setId(1L);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mark");
        owner2.setLastName("Anthony");
        owner2.setId(2L);

        ownerService.save(owner1);
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("VetDr1");
        vet1.setLastName("Frank");
       vet1.setId(1L);

        Vet vet2 = new Vet();
        vet2.setFirstName("VetDr2");
        vet2.setLastName("Ivan");
       vet2.setId(2L);

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.print("");

    }
}
