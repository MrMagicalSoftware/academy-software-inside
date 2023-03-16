
public class Test {

	public static void main(String[] args) {
		
		
		int numeroViveri = 3;
		
		try {
	
			
			if(numeroViveri < 10)
				throw new RunOutOfFoodException();
			
			
		}catch (RunOutOfFoodException e) {
			System.err.println(e);
			System.out.println("####-----------###########");
			System.out.println("RICERCA CIBO  . . . . . . . .. ROBY FAME ");

		}
	
		
		
		
	}

}
