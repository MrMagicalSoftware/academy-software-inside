package it.softwareInside.NoteAppLezione22.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nota {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	
	@NotNull
	@NotEmpty
	private String testo , autore;


	public Nota(@NotNull @NotEmpty String testo, @NotNull @NotEmpty String autore) {
		setTesto(testo);
		setAutore(autore);
	}
	
	
	
	
}
