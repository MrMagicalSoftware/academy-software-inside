package it.softwareInside.esempioExtends;

public class Lavoratore extends Persona {

	
	private double salario;
	
	

	
	public Lavoratore() {
		this("mario", 23, 20);
	
	}


	public Lavoratore(String nome, int eta , double salario) {
		super(nome, eta);
		setSalario(salario);
		
		//setAttributo1(dajdjsadj)
		//setAttributo1(dajdjsadj)	
		//setAttributo1(dajdjsadj)
		//setAttributo1(dajdjsadj)
	}

	

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		
		return super.toString()  + " SALARIO " + this.salario ; 
	}
	
	
	@Override
	public void saluta() {
		
		super.saluta();
		System.out.println("OK SONO UN LAVORATORE  YUPPY YUPPIIII");
	}
	
	
	
	
	
}
