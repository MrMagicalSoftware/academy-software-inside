import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Eroe {

	
	
	private Random random;
	private int puntiAttacco;
	private int puntiVita;
	private boolean isAlive;
	private String nome;
	
	
	public int generaAttacco(int low , int upp) {
		
		
		return this.puntiAttacco + random.nextInt(low, upp + 1);
	}


	public Eroe(String nome, int puntiAttacco, int puntiVita) {
		
		setNome(nome);
		setPuntiAttacco(puntiAttacco);
		setPuntiVita(puntiVita);
		
		this.isAlive = true;
		this.random = new Random();
	}
	
	
	
	public void setPuntiVita(int puntiVita) {
		
		if(this.puntiVita <= 0)
			this.isAlive = false;
		
		this.puntiVita = puntiVita;
	}
	
	

	
	
	
	
	
	
	
}
