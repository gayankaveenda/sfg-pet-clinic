package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner> {

    default Owner findByLastName(String lastName) {
        return null;
    }

}
