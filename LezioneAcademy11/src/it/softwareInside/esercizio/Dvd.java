package it.softwareInside.esercizio;

import java.util.Random;

public class Dvd {

	
	private String genere, titolo;
	private double prezzo;
	private boolean isFamilyF ;
	
	
	
	public Dvd() {
		initDvd();
	}
	
	
	
	
	
	
	public Dvd(String genere, String titolo, double prezzo, boolean isFamilyF) {
		
		setTitolo(titolo);
		setFamilyF(isFamilyF);
		setGenere(genere);
		setPrezzo(prezzo);
				
	}






	public void initDvd() {
		Random random = new Random();
		
		setPrezzo(random.nextDouble(9, 31));
	
		String[] genereVett = { "avventura" , "fantasy" ,
				                    "giallo", "horror"};
		
		
		String genereScelto  = genereVett[random.nextInt(0, genereVett.length)];
									
		String[] titoliFilm  = {"Avventura1" , "Avventura2" , "Avventura3",
								"Fantasy1" , "Fantasy2", "Fantasy3",
								"Giallo1" , "Giallo2" ,"Giallo3",
								"Horror1" , "horror2"
				                 };
		
		setGenere(genereScelto);
		
//		if(genereScelto.equals("avventura")) {
//			
//		}
//		else if(genereScelto.equals("fantasy")) {
//			
//		}
//		else if(genereScelto.equalsIgnoreCase("giallo")) {
//			
//		}else {
//			
//		}
		
		switch (genereScelto) {
		case "avventura":
			
			setFamilyF(true);
			setTitolo(      titoliFilm[random.nextInt(0 , 3 )]  );
			
			break;
		
		case  "fantasy":
			
			setFamilyF(true);
			setTitolo(      titoliFilm[random.nextInt(3 , 6 )]  );
			break;

		case "giallo" :
			setFamilyF(false);
			setTitolo(      titoliFilm[random.nextInt(6 , 9 )]  );
			break;
			
			
		default:
			setFamilyF(false);
			setTitolo(      titoliFilm[random.nextInt(9,11 )]  );
			break;
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		
		
		String ris  = isFamilyF  ?  "Adatto a tutti " : "Non adatto a tutti";
		
		
		return "Dvd [genere=" + genere + ", titolo=" 
				+ titolo + ", prezzo=" + prezzo +  " " + ris   + " ]";
	}
	
	
	
	
	
	
	//___________SETTING_________________//

	

	public void setFamilyF(boolean isFamilyF) {
		this.isFamilyF = isFamilyF;
	}
	
	
	/***
	 * 
	 * 
	 *    "avventura" , "fantasy" ,
	       "giallo", "horror"
	 * 
	 * 
	 * @param genere
	 */
	public void setGenere(String genere) {
		
		switch (genere) {
		case "avventura":
			this.genere = "avventura";
			break;
		case "fantasy":
			this.genere = "fantasy";
			break;	
		case "giallo":
			this.genere = "giallo";
			break;	
		case "horror":
			this.genere = "horror";
			break;	

		default:
			this.genere = "N/A";
			break;
		}
		
		
		
	}
	
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void setPrezzo(double prezzo) {
		
		this.prezzo = prezzo > 9 ?  prezzo  :  9 ; 
		
		
	}
	
	//_____________GETTING_______________________//
	
	
	public boolean isFamilyF() {
		return isFamilyF;
	}
	
	
	public String getGenere() {
		return genere;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	
	public String getTitolo() {
		return titolo;
	}
	
	
}
