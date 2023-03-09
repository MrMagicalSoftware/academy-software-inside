package it.softwareInside.esempioExtends;

public class Studente extends Persona {


	//eta --- nome
	
	private String materiaDiStudio;
	
	
	
	public Studente() {
		super(); // chiama il construttore di default della classe padre
		setMateriaDiStudio(materiaDiStudio);
	}
	
	
	public Studente( String nome , int  eta,  String materiaDiStudio) {
		
		super(nome, eta);
		
		
		setMateriaDiStudio(materiaDiStudio);
	}
	
	
	
	public Studente(String nome) {
				
		
		super(nome, 25);
		
		setMateriaDiStudio("informatica");
	}
	
	
	@Override
	public String toString() {
		
	
		return super.toString() + " " +  this.materiaDiStudio;
		
//		return "nome " + super.getNome() + " eta " + super.getEta()  +
//				" " + this.materiaDiStudio;
		
	}
	
	@Override
	public void saluta() {
		super.saluta();
		System.out.println("OK IO STUDIO " + this.materiaDiStudio);
	}
	
	
	
	
	public String getMateriaDiStudio() {
		return materiaDiStudio;
	}
	
	
	
	public void setMateriaDiStudio(String materiaDiStudio) {
		this.materiaDiStudio = materiaDiStudio;
	}
	
}
