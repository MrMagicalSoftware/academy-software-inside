import java.util.Random;

public class ExampleTry {

	public static void main(String[] args) {
		
		
		ExampleTry exampleTry = new ExampleTry();
		
		int numeroGenerato = 0;//exampleTry.generaNumero();
		System.out.println("----> " + numeroGenerato);
		
		int[] vett = null;
		
		try {
		
			
			if(numeroGenerato == 0)
				throw new Exception();
			
			vett = new int[numeroGenerato];
		
			
			
		}catch (NegativeArraySizeException e) {
			
			vett = new int[5];
		}catch (Exception e) {
			System.out.println("********************++");
			vett = new int[15];
		}
		
		
		
	
		System.out.println("ho creato un vettore di dimensione " + vett.length);
		
		
		
	}
	
	
	
	public  int generaNumero() {
		return new Random().nextInt(-5, 5); // -5 -4 -3 -2  . . .. . .  4 
	}
	
}
