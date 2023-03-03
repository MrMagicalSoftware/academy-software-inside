package it.softwareInside.book;

import java.util.Scanner;

public class StarterBook {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Vuoi creare un nuovo libro ? si o no ");
		
		String ris = key.nextLine();
		
		if(ris.equals("si")) {
			
			System.out.println("Titolo");
			String titolo = key.nextLine();
			
			
			System.out.println("sCRIVI AUTORE ");
			String autore = key.nextLine();
			
			System.out.println("sCRIVI genere ");
			String genere = key.nextLine();
			
			System.out.println("Numero di pagine");
			int numeroDiPagine = key.nextInt();
			
			System.out.println("Prezzo");
			double prezzo = key.nextDouble();
			
			
			
			Book book1 = new Book();
			System.out.println(book1);
			
			book1.setAutore(autore);
			book1.setGenere(genere);
			book1.setTitolo(titolo);
			book1.setNumeroDiPagine(numeroDiPagine);
			book1.setPrezzo(prezzo);
			
			//System.out.println(book1.getTitolo() + " " + book1.getAutore());
			
			System.out.println(book1);
			System.out.println(book1.toString());
			
			Book book2 = new Book();
			book2.setAutore("asdsa");
			book2.setTitolo("");
			book2.setPrezzo(100);
			book2.setNumeroDiPagine(33);
			
			
			if(book1.getPrezzo() > book2.getPrezzo())
				System.out.println(book1);
			else if(book1.getPrezzo()  == book2.getPrezzo())
				System.out.println("Stesso prezzo" + book1 + "   " + book2);
			else
				System.out.println(book2);

		}
		else {
			System.out.println("ok ciao alla prossima");
			System.exit(0);
		}
		
		
	
		key.close();
	}
	
	
	
}
