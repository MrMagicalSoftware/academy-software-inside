
public class StarterMain {

	public static void main(String[] args) {
		
		
		System.out.println("Comando passato " + args[0]);

		
		switch (args[0]) {
		case "stampa":
			
			int i= 0;
			do {
				
				try {
					Thread.sleep(2 * 1000);
					System.out.println(i);
					i++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} while (i <100 );
			
			break;
		case "exit":
			System.exit(0);
			
			break;
		default:
			break;
		}
		
	}

}
