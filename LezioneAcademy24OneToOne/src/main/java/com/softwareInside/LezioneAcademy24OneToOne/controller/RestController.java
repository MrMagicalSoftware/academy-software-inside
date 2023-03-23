package com.softwareInside.LezioneAcademy24OneToOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.softwareInside.LezioneAcademy24OneToOne.models.Libro;
import com.softwareInside.LezioneAcademy24OneToOne.service.LibroService;


@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	
	@Autowired
	LibroService libroService;
	
	
	@PostMapping("/prova")
	public boolean test(@RequestBody Libro libro) {
		
		System.out.println(libro);
		
		return libroService.addLibro(libro);
	}
	
	
	@GetMapping("/all")
	public List<Libro> all() {
		
		return libroService.stampa();
	}
	
	
	//@PathParam("id") int id
	
	@DeleteMapping("/cancella")
	public Libro cancella(@RequestParam("id") int id) {
		
		System.out.println("id passato " + id );
		
		
		return libroService.cancella(id);
	}
	
	
	
	
	
}
