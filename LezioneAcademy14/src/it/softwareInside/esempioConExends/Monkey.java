package it.softwareInside.esempioConExends;

public class Monkey  extends Animale{

	public Monkey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Monkey(String colore, char sesso, int eta) {
		super(colore, sesso, eta);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	@Override
	public void saluta() {
	
		int i = 0 ;
		do {
			System.out.println("uuu aaa uuu a auauauau uuua a");
			i++;
		} while (i < 3);
		
	}
	
	
	
	
}
