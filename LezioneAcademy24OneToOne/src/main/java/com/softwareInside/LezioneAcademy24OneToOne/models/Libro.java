package com.softwareInside.LezioneAcademy24OneToOne.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	private String titolo;
	
	
	private int numeroPagine;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "autore_id")
	private Autore autore;


	public Libro(String titolo, int numeroPagine, Autore autore) {
		
		setTitolo(titolo);
		setAutore(autore);
		setNumeroPagine(numeroPagine);
		
		
	}
	
	
	
	
	
}
