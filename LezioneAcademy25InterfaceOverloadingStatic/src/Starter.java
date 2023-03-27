import java.util.ArrayList;
import java.util.Date;


public class Starter {

	
	//concetto di overloading
	//overloading significa sovraccarico dei metodi..
	
	
	
	public int calcolaSomma(int numero1 , int numero2 ) {
		
		return numero1 + numero2;
	}
	
	
	
	public int calcolaSomma(int numero1 , int numero2 , int numero3) {
		return numero1 + numero2 + numero3;
	}
	
	
	public double calcolaSomma(int numero1 , double numero2) {
		return numero1 + numero2;
	}
	
	public int calcolaSomma(String nome) {
		return nome.length();
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		
		Starter starter = new Starter();
		
		starter.calcolaSomma(2, 10);
		
		ArrayList<String> ex = new ArrayList<>();
		
		var i = 10;
		var myDate = new Date();		
		System.out.println(myDate.toLocaleString());

		
	}

	

}
