import java.util.Random;

public class Starter {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		Persona persona = new Persona();
		// null null 0 
		// nome = null cognome = null eta = 0
		
		
//		persona.nome = "mario"; 
//		
//		persona.nome +=  " claudio";  // persona.nome  = persona.nome  + " claudio"
//	
		//persona.eta = random.nextInt(18, 41);
		
		
		
		persona.setNome("gigino");
		persona.setEta(20);
		
		
	
		persona.saluta();
		
		
		
	}
	
}
