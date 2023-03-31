import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class Orco {


	
	private boolean isAlive;
	private String nome;
	private int puntiVita;
	
	
	
	
	
	public int sassata() {
		Random random = new Random();
		
		return random.nextInt(15 , 30);
	}





	public Orco(String nome, int puntiVita) {
		super();
		this.nome = nome;
		this.puntiVita = puntiVita;
		this.isAlive = true;
	}
	
	
	public void setPuntiVita(int puntiVita) {
		
		if(this.puntiVita <= 0) {
			this.isAlive = false;
		}
		
		this.puntiVita = puntiVita;

	}
	
	
	
	
	
	
}
