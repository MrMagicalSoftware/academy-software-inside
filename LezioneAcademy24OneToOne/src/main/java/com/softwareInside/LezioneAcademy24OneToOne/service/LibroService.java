package com.softwareInside.LezioneAcademy24OneToOne.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwareInside.LezioneAcademy24OneToOne.models.Libro;
import com.softwareInside.LezioneAcademy24OneToOne.repository.LibroRepository;

@Service
public class LibroService {

	@Autowired
	LibroRepository libroRepository;
	
	
	
	
	public boolean addLibro(Libro libro) {
		
		
		try {
			libroRepository.save(libro);
			return true;
			
		}catch (Exception e) {
			return false;
		}
		
	}
	
	
	public List<Libro> stampa() {
		
		
		return libroRepository.findAll();
	}
	
	
	public Libro cancella(int id) {
		
		try {
			
			Libro libro = libroRepository.findById(id).get();
			libroRepository.deleteById(id);
			
			return libro;
		}catch (Exception e) {
			return null;
		}
		
		
	}
	
	
}
