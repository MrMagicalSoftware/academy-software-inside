package it.softwareInside.esercizioNave;

public class Passeggero extends Persona{
	
	private String cartaDiImbarco;

	public Passeggero() {
		super();
		setCartaDiImbarco("A135");
		
	}

	public Passeggero(String nome, int eta, String cartaDiImbarco) {
		super(nome, eta);
		setCartaDiImbarco(cartaDiImbarco);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Carta di imbarco " + this.cartaDiImbarco;
	}
	
	
	public void setCartaDiImbarco(String cartaDiImbarco) {
		this.cartaDiImbarco = cartaDiImbarco;
	}
	
	public String getCartaDiImbarco() {
		return cartaDiImbarco;
	}
	

}
