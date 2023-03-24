package it.softwareInside.AnagraficaAppLezione23.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;
import it.softwareInside.AnagraficaAppLezione23.service.PersonaService;



@RequestMapping("/api")
@RestController
public class PersonaRestController {

	
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/show-data")
	public List<Persona> getData(@RequestParam("eta") int eta) {
		
		return personaService.getAllPersoneMaggioriDiEta(eta);
	
	}
	
	
	@PostMapping("/save")
	public boolean  save(@RequestBody Persona persona) {
		
		return personaService.savePersona(persona);
	}
	
	
	
}
