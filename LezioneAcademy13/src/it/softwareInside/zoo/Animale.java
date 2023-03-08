package it.softwareInside.zoo;

import java.util.Random;

public class Animale {
	

	private int eta;
	private char sesso;
	private String specie;
	
	
	
	
	public Animale() {
		this("pinguino", 5, 'f');
	}
	
	
	
	
	public Animale(String specie ,int eta, char sesso) {
		
		setSpecie(specie);
		setEta(eta);
		setSesso(sesso);
	}




	@Override
	public String toString() {
		return "Animale [eta=" + eta + ", sesso=" + sesso + ", specie=" + specie + "]";
	}
	
	

	public void setSesso(char sesso) {
		
		Random random = new Random();
		char sessoScelto = random.nextBoolean() ? 'm': 'f';
		
		this.sesso = sesso == 'm' || sesso == 'f' ? sesso : sessoScelto ;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	
	
	public int getEta() {
		return eta;
	}
	
	public String getSpecie() {
		return specie;
	}
	
	public char getSesso() {
		return sesso;
	}

}
