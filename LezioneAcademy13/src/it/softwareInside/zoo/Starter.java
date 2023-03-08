package it.softwareInside.zoo;

public class Starter {
	
	public static void main(String[] args) {
		

		
		Zoo zoo = new Zoo();
		

		System.out.println(		zoo.addAnimale(new Animale("leone", 12, 'm')));
		System.out.println(		zoo.addAnimale(new Animale("leone", 6, 'm')));
		
		zoo.addAnimale(new Animale("leone", 6, 'f'));
		zoo.addAnimale(new Animale("leone", 5, 'f'));
		zoo.addAnimale(new Animale("pingu", 5, 'f'));
		zoo.addAnimale(new Animale("pingu", 5, 'f'));
		zoo.addAnimale(new Animale("pingu", 5, 'f'));

		int i = 0 ;
		
		System.out.println("#########");
		do {
			
			System.out.println(			zoo.addAnimale(new Animale("pingu", 5, 'f')));
			
			i++;
		} while (i< 10);
		
		
		zoo.stampaZoo();
	}

}
