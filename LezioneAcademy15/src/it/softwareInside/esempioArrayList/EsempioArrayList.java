package it.softwareInside.esempioArrayList;

import java.util.ArrayList;

public class EsempioArrayList {

	public static void main(String[] args) {
		
	
		/*
		 * Array list è una struttura dati
		 * ovvero un modo per organizzare i dati
		 * cugino del vettore è molto simile a un vettore 
		 * classico , le posizioni vanno da 0 fino a n-1
		 * 
		 * Vantaggio : L'ARRAY LIST puo' assumere la dimensioni diverse in momenti diversi
		 * è flessibile,
		 * l'array no ..
		 * 
		 * 
		 */
		
		
		//String[] vett = new String[DIMENSIONE]
		
		ArrayList<String> carrello  = new ArrayList<>();

		
		carrello.add("item1");
		carrello.add("item2");
		carrello.add("item3");
		
		//System.out.println(carrello);
		
	
		for(String elemento : carrello)
			System.out.println(elemento);
		
		System.out.println("##############");
		

		for(int i = 0 ; i < carrello.size() ; i++)
			System.out.println(   carrello.get(i) );
		
		
		
		//ArraY List
		
		ArrayList<MyWrapInteger> myArr2 = new ArrayList<>();
		myArr2.add(new MyWrapInteger(3));
		myArr2.add(new MyWrapInteger(6));
		myArr2.add(new MyWrapInteger(9));
		
		System.out.println("###########");
		
		for(MyWrapInteger el : myArr2)
			System.out.println(el.getNumero());
		
		System.out.println("######################");
		
		
		ArrayList<Integer> myArr = new ArrayList<>();
		
		myArr.add(3);
		myArr.add(19);
		myArr.add(33);
		
		for(Integer i : myArr) 
			System.out.println(i);
		
		

		ArrayList<Double> arrayListDouble = new ArrayList<>();
		
		ArrayList<Character> arrayListChar = new ArrayList<>();
		ArrayList<Float> arrayListFloat = new ArrayList<>();

	}

	
	
}
