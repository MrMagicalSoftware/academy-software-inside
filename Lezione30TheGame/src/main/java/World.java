import java.util.Random;


import lombok.Data;



@Data
public class World {

	private Random random;
	private Orco orco;
	private Eroe eroe;
	
	
	public World(Orco orco , Eroe eroe) {
		this.orco = orco;
		this.eroe = eroe;
		this.random = new Random();
	}
	
	
	
	public void combattiInArena() throws InterruptedException {
		
		
		System.out.println("####### Game start #####");
		
	
		
		while(this.eroe.isAlive() && this.orco.isAlive()) {
			
			
			Thread.sleep(3 * 1000);
			
			if(sceltaCharacter() instanceof Eroe) {
				
				
				int dannoEroe = this.eroe.generaAttacco(5, this.random.nextInt(5, 11));
				
				System.out.println("EROE ATTACK " + dannoEroe);


				this.orco.setPuntiVita( this.orco.getPuntiVita() - dannoEroe  );
				
			}
			else {
				
				int dannoOrco = this.orco.sassata();
				System.out.println("OROCO ATTACK " + dannoOrco);

				this.eroe.setPuntiVita( this.eroe.getPuntiVita() - dannoOrco);

			}
			
			System.out.println("EROE :" + this.eroe.getPuntiVita());
			System.out.println("ORCO :" + this.orco.getPuntiVita());
			System.out.println("--------------------------------------------");
			
		
			
		}
		
		System.out.println("------------VINCITORE -----------");
		
		if(this.orco.isAlive())
			System.out.println(orco);
		else
			System.out.println(eroe);

		
	}
	
	
	/**
	 * 
	 * 
	 * @return
	 */
	public Object sceltaCharacter() {
		
		// 1 2 3 SCELTA ORCO
		
		// 4 5 6 7 8 SCELTA EROE
		
		return this.random.nextInt(1, 9 ) >= 4 ? this.eroe : this.orco;
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Orco orco = new Orco("orco monello" , 120);
		Eroe eroe = new Eroe("GIGI", 10, 100);
		
		World world = new World(orco, eroe);
		
		
		try {
			world.combattiInArena();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
