package it.softwareInside.car;

public class Starter {

	public static void main(String[] args) {
		
		Automobile automobile = new Automobile();
		
		System.out.println("##############");
		
		System.out.println(automobile);
		
		
		System.out.println("#####################");
		
		
		Automobile automobile2 = new Automobile("ferrari", 200, new Engine(300), 
				new Carrozzeria("fibra di carbonio in titanio", "metallizata", "rosso"));
		
		
		System.out.println(automobile2);
		System.out.println(automobile2.toString());


	}

}
