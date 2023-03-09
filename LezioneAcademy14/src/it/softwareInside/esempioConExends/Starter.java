package it.softwareInside.esempioConExends;

public class Starter {

	public static void main(String[] args) {
		
		
		
		Zoo zoo = new Zoo();
		Leone leone = new Leone();
		
		zoo.addAnimale(leone);
		zoo.addAnimale(new Monkey());
		zoo.addAnimale(new Pinguino() );;

		
		
		Animale risAnimaleRimossoAnimale = zoo.remove(0);
		
		
		System.out.println("remove ----->   " + risAnimaleRimossoAnimale);
		
		zoo.stampaZoo();

	}

}
