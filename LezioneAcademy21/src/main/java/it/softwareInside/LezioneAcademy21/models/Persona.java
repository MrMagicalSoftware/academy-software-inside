package it.softwareInside.LezioneAcademy21.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Persona {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id ;
	
	@Column(name = "nome")
	private String nome;
	
	
	private String telefono;
	
	
	
	public Persona(String nome , String telefono) {
		setNome(nome);
		setTelefono(telefono);
	}
	
}
