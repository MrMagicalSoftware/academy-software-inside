package it.softwareInside.AnagraficaAppLezione23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;
import it.softwareInside.AnagraficaAppLezione23.repository.PersonaRepository;
import jakarta.validation.Valid;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	
	public List<Persona> getAllPersoneMaggioriDiEta(int eta){
		
		try {
			return personaRepository.getAllPersoneMaggiori(eta);
		}catch (Exception e) {
			System.err.println(e);
			return null;
		}
		
		
	}
	
	
	/**
	 * 
	 * 
	 * @param persona
	 * @return
	 */
	public boolean savePersona(@Valid Persona persona) {
		
		try {
			personaRepository.save(persona);
			return true;
			
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}
	
	
}
