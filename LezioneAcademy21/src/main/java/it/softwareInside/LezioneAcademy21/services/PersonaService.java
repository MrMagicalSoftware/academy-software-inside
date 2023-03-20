package it.softwareInside.LezioneAcademy21.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.LezioneAcademy21.models.Persona;
import it.softwareInside.LezioneAcademy21.repository.PersonaRepository;

@Service
public class PersonaService {

	
	@Autowired
	PersonaRepository personaRepository;
	
	
	public boolean addToDatase(Persona persona) {

		if(persona == null)
			return false;
		
		
		
		
		try {
			
			personaRepository.save(persona);
			
			return true;
		} catch (Exception e) {
			
			return false;
		}
		
	}
	
	
	
	
}
