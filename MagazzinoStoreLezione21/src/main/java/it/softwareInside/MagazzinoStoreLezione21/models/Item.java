package it.softwareInside.MagazzinoStoreLezione21.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data


@Entity
public class Item {
	
	
	
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	
	
	
	private String marca;
	
	@Column(name = "prezzo_articolo")
	private double prezzo;
	
	
	private String tipologia;


	public Item(String marca, double prezzo, String tipologia) {
		
		setMarca(marca);
		setPrezzo(prezzo);
		setTipologia(tipologia);
		
	}
	
	
	
	
	
}
