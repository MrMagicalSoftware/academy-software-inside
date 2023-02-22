package it.softwareInside.riepilogo;

import java.util.Scanner;

public class EsecizioVersioneB {

	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int numero1 , numero2 ;
		int  min , max;
		
		
		System.out.println("INSERISCI 2 NUMERI");
		System.out.println("############");
		
		
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		
		max = numero1 > numero2 ? numero1 : numero2;
		min = numero1 < numero2 ? numero1 : numero2;
		
		
		while(min <= max) {
			
			System.out.print (min + " ");
			min++;
		}
		
		
		key.close();
	}
	
}
