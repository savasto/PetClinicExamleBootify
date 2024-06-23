package io.bootify.pet_clinic.visit;

import io.bootify.pet_clinic.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VisitRepository extends JpaRepository<Visit, Integer> {

    Visit findFirstByPet(Pet pet);

}
