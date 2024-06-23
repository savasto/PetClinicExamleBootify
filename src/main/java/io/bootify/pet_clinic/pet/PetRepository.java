package io.bootify.pet_clinic.pet;

import io.bootify.pet_clinic.owner.Owner;
import io.bootify.pet_clinic.type.Type;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PetRepository extends JpaRepository<Pet, Integer> {

    Pet findFirstByOwner(Owner owner);

    Pet findFirstByType(Type type);

}
