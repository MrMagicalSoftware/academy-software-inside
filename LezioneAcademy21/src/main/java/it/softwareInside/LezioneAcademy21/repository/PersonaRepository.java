package it.softwareInside.LezioneAcademy21.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import it.softwareInside.LezioneAcademy21.models.Persona;


@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

	
	
}
