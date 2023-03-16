package it.softwareInside.LezioneAcademy19.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

	
	@GetMapping("/pari-dispari")
	public boolean isPari( @RequestParam("n") int numero ) {
		
		return numero % 2 == 0 ;
	}
	
	@GetMapping("/maggiore")
	public int trovaMaggiore(@RequestParam(name="num1") int primoNumero ,
			@RequestParam(name="num2") int secondoNumero) {
		
		return primoNumero > secondoNumero ? primoNumero : secondoNumero;
	}
	
	
	@GetMapping("/divisione")
	public int divisione(@RequestParam("n1") int numero1 ,
			@RequestParam("n2") int numero2) {
		
		int divisione ;
		
		try {
			divisione = numero1 / numero2;
		}catch (Exception e) {
			
			System.out.println("exception " + e);
			return 0;
		}
		
		return divisione;
		
	}
	
	
	
	@GetMapping("/divisione2")
	public String  divisione2(@RequestParam("n1") String numero1 ,
			@RequestParam("n2") String numero2) {
		
		int divisione ;
		
		try {
			divisione = Integer.parseInt(numero1) / Integer.parseInt(numero2);
			
			return divisione + "";
		}
			
		catch (NumberFormatException e) {
			return "errore di conversione tra string e int " + e; 
		}
		catch (ArithmeticException e) {
			
			return "non posso dividere per 0 " + e;
		}
		catch (Exception e) {
			
			return "generico errore " + e;
		}
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
