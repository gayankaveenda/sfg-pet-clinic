package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.Objects;

//@Entity
public class Pet extends BaseEntity {

    // @OneToOne
    //@JoinColumn(name = "petType_id", nullable = false)
    private PetType petType;


    //@OneToOne
    //@JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    private LocalDate birthDate;


    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petType, pet.petType) &&
                Objects.equals(owner, pet.owner) &&
                Objects.equals(birthDate, pet.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petType, owner, birthDate);
    }
}
