package it.softwareInside.LezioneAcademy21.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareInside.LezioneAcademy21.models.Persona;
import it.softwareInside.LezioneAcademy21.repository.PersonaRepository;
import it.softwareInside.LezioneAcademy21.services.PersonaService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	
	
	@Autowired
	PersonaService personaService;
	
	
	
	@PostMapping("/crea")
	public boolean creaPersona(@RequestBody Persona persona) {
		
		
		System.out.println("#################à");
		System.out.println(persona);
		
		
		
		return personaService.addToDatase(persona);
	}
	
	
	
	@PostMapping("/hello")
	public String hello(@RequestBody String nome) {
		
		return "ciao da post mapping " + nome;
	
	}
	
	
	
	@GetMapping("/hello")
	public String hello2() {
		
		return "ciao da get mapping";
	
	}
	
	
	@DeleteMapping("/hello")
	public String hello3() {
		
		return "ciao da delete mapping";
	
	}
	
	
	
	
	/*
	@Autowired
	PersonaRepository personaRepository;
	
	
	@GetMapping("/delete-all")
	public boolean deleteAllData(@RequestParam("pass") String pass ) {
		
		String myPassString = "123456";
		
		if(! pass.equals(myPassString))
			return false;
		
		try {
			
			personaRepository.deleteAll();
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
		
		
	}
	
	
	@GetMapping("/delete")
	public Persona deletePersona(@RequestParam("id") int id) {
		
		
		//retrieve ---recuperare
		Persona persona = personaRepository.findById(id).get();
		
		personaRepository.deleteById(id);
		
		return persona;
		
	}
	
	
	
	
	@GetMapping("/crea-persona")
	public boolean creaPersona(@RequestParam("n") String nome , @RequestParam("t") String telefono) {
		
		if(nome == null || nome.isEmpty() || telefono == null || telefono.isEmpty())
			return false;
		
		
		try {
			
			personaRepository.save(new Persona(nome , telefono));
			
			return true;
			
		}catch (Exception e) {
			System.out.println("ERRORE " +e );
			return false;
		}
	}
	
	
	@GetMapping("/save-test")
	public boolean saveTest() {
		
		
		try {
			Persona p1 = new Persona();
			p1.setNome("mario");
			p1.setTelefono("3336781638");
			
			personaRepository.save(p1);
			
			return true;
			
		}catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	
		
	}
	
	*/
	
}
