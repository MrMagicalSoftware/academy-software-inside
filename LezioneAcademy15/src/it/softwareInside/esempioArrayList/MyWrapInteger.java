package it.softwareInside.esempioArrayList;

public class MyWrapInteger {

	private int numero;
	
	MyWrapInteger(){
		this(0);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.numero + "";
	}
	
	MyWrapInteger(int numero){
		setNumero(numero);
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
