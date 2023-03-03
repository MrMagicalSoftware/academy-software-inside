package it.softwareInside.car;

public class StarterAuto {

	
	public static void main(String[] args) {
		
		
		
		Car myCar = new Car();
		
		System.out.println(myCar);
		
		myCar.setColore("giallo");
		myCar.setMarca("JR");
		
		System.out.println(myCar);
		
		
		Car myCar2 = new Car("panda","rosa" , 5, 100);
		
		int i = 0 ;
		
		do {
			myCar2.frena();
			i++;
		} while (i < 10);
		System.out.println(myCar2.getVelox());

		
		myCar2.frenata(20);
		
		System.out.println(" ---->########");
		System.out.println(myCar2.getVelox());
		
	
		
	}
	
	
}
