package it.softwareInside.esempio2Classi;

public class Starter {

	public static void main(String[] args) {
		
		Pc pc = new Pc();
		
		System.out.println(pc);
		
		Monitor nuovoMonitor = new Monitor("Philips", 900, 50);
		
		pc.setMonitor(nuovoMonitor);
		
		System.out.println("############################");
		System.out.println(pc);
	}
	
}
