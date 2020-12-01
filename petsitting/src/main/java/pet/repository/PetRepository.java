package pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pet.beans.Pet;


@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{

}

