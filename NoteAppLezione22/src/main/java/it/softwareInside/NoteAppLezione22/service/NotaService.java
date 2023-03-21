package it.softwareInside.NoteAppLezione22.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.NoteAppLezione22.models.Nota;
import it.softwareInside.NoteAppLezione22.repository.NotaRepository;
import jakarta.validation.Valid;

@Service
public class NotaService {
	
	@Autowired
	NotaRepository notaRepository;
	
	
	public boolean addNota(@Valid Nota nota) {
		try {
			
			notaRepository.save(nota);
			return true;
			
		}catch (Exception e) {
			return false;
		}
	}
	

}
