package it.softwareInside.esercizio;

import java.util.Scanner;

public class StarterDVD {

	public static void main(String[] args) {
		
		
		
		Scanner key = new Scanner(System.in);
		
		Dvd[] listaDvd =new Dvd[20];
		
		for (int i = 0; i < listaDvd.length; i++) {
			listaDvd[i] = new Dvd();
		}
		
		System.out.println("#####################à");
		
		for(Dvd dvd : listaDvd)
			System.out.println(dvd);
		
		int prezzo;
		String genere;
		
		//gestione del genere
		do {
			System.out.println("Inserisci il genere");
			genere = key.next();
		} while ( !genere.equals("avventura") && !genere.equals("horror") 
				 && !genere.equals("giallo")   && !genere.equals("fantasy")  
				);
		
		//    !  true  || !false
		// ! true  && ! false ===>   false && true ==> false
		// ! false && ! false ==>  true && true ==> true
		
		
		//gestione del prezzo
		do {
			System.out.println("Inserici un prezzo maggiore di 9 ");
			prezzo = key.nextInt();
		} while (prezzo < 9 );
		
		
		
		System.out.println("################");
		
		for(Dvd dvd : listaDvd) {
			
			if(dvd.getGenere().equals(genere) && dvd.getPrezzo() < prezzo)
				System.out.println(dvd);
			
			
		}
		
		/*
		
		for (int i = 0; i < listaDvd.length; i++) {
			if(listaDvd[i].getGenere().equals(genere) 
					&& listaDvd[i].getPrezzo() < prezzo) {
				
				System.out.println(listaDvd[i]);
			}
			
		}
		
		*/
		
		
		
		
		
		key.close();
		
		
		
		//creare  un vettore di 20 elementi
		//riempirlo con dei dvd
		
		// prendere in input una stringa
		// e un numero e stampare  a video
		
		// tutti i dvd che hanno il genere inserito da tastiera
		// e hanno un prezzo <= al valore inserito dall'utente.
		
		//check controllo genere
		// avvenuta 
		// 30 
		// AVVENTURA1 18EURO   ,    AVVENTURA2 30EURO  , AVVENTURA3 10EURO
		
		
	}

}
