import java.math.MathContext;

public class StarterPersona {
	
	
	

	public static  void main(String[] args) {
		
		System.out.println("#########");
		
		
		Persona p1 = new Persona("MTT", "rob88", "mr");
		Persona p2 = new Persona("MTT", "rob", "mr");

		
		
//		System.out.println(   p1.equals(p2)  );
//		
//		
//		Math.pow(2, 3);
//		
//	
//		
//		ExampleClass.saluta();
//		
//		String ris =  Integer.toString(8);
//		
//		ExampleClass exampleClass = new ExampleClass();
//		
//		exampleClass.somma(10, 30);
		
		
		
		System.out.println(Utils.today());
		
		System.out.println(Utils.todayPlus(-10 , 0));
	}
	
}
