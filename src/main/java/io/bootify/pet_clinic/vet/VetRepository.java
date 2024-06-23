package io.bootify.pet_clinic.vet;

import io.bootify.pet_clinic.specialty.Specialty;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VetRepository extends JpaRepository<Vet, Integer> {

    Vet findFirstByVetSpecialtySpecialties(Specialty specialty);

    List<Vet> findAllByVetSpecialtySpecialties(Specialty specialty);

}
