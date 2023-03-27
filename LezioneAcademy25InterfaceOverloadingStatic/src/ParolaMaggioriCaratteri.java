
public class ParolaMaggioriCaratteri {

	public static void main(String[] args) {
		
		System.out.println("################");
		
		System.out.println(trovaMaggiore(args));
		
	}
	
	
	
	
	public static String  trovaMaggiore(String[] parole) {
		
		
		String parolaMaggiore ="";
		
		for (String parola : parole) {
			if(parola.length() > parolaMaggiore.length() )
				parolaMaggiore = parola;
		}
		
		return parolaMaggiore;
	}
	
}
