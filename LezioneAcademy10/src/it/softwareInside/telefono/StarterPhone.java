package it.softwareInside.telefono;

import java.util.Random;

public class StarterPhone {

	public static void main(String[] args) {
		
		Phone[] phones = new Phone[10];
		Random random = new Random();
		
		
		for (int i = 0; i < phones.length; i++) {
			System.out.println(phones[i]);
		}
		
		System.out.println("##########################");
		
		
		for (int i = 0; i < phones.length; i++) {
			
			Phone tmpPhone = new Phone();
			tmpPhone.setCosto(random.nextDouble(100, 999));
			phones[i] = tmpPhone;
			
			
		}
		
		System.out.println("##########################");

		
		
		for (int i = 0; i < phones.length; i++) {
			System.out.println(phones[i] + " " );
		}
		
		
		Phone minPhone=phones[0] ;
		
		
		for (int i = 1; i < phones.length; i++) {
			
			
			if(phones[i].getCosto() < minPhone.getCosto()) {
				minPhone = phones[i];
			}
			
		}
		
		
		System.out.println("***************  MINIMO ******************");
		System.out.println(minPhone);

		
		
	}

}
