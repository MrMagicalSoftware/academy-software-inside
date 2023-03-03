
public class StarterPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		persona1.setCognome("rossiuuuuuuuuuuuuu");
		persona1.setNome("mario");
		persona1.setEta(25);
		
		
		
		Persona persona2 = new Persona();
		persona2.setCognome("bianchi");
		persona2.setNome("luigi");
		persona2.setEta(35);
		
		
		if(persona1.getEta() > persona2.getEta()) 
			System.out.println(persona1.getNome());
		else
			System.out.println(persona2.getNome());

		
//		System.out.println("nome " + persona.getNome() 
//		          + " cognome " + persona.getCognome() + 
//		          " eta " + persona.getEta() );
	
		
		
		System.out.println("***************************");
		System.out.println("Cognome con maggiore carattere");

		
		if(persona1.getCognome().length() >= persona2.getCognome().length() )
			System.out.println(persona1.getCognome());
		else
			System.out.println(persona2.getCognome());
		
		
	}

}
