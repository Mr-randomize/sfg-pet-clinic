package com.iviberberi.sfgpetclinic.repositories;

import com.iviberberi.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
