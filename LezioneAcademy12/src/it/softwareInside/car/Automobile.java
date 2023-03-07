package it.softwareInside.car;

public class Automobile {

	private String marca;
	private double costo;
	
	private Engine engine;
	
	private Carrozzeria carrozzeria;
	
	
	public Automobile(String marca, double costo ,
			Engine engine , Carrozzeria carrozzeria) {
		
		setMarca(marca);
		setCosto(costo);
		setEngine(engine);
		setCarrozzeria(carrozzeria);
		
	}
	
	
	public Automobile() {
		
		this("mazda", 20, new Engine(150), new Carrozzeria());
//		setMarca("mazda");
//		setCosto(20);
//		setEngine( new Engine(150)  );
//		setCarrozzeria( new Carrozzeria()  );
	}
	
	
	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", "
				+ "costo=" + costo + ", engine=" + engine 
				+ ", carrozzeria=" + carrozzeria
				+ "]";
	}

	public Carrozzeria getCarrozzeria() {
		return carrozzeria;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setCarrozzeria(Carrozzeria carrozzeria) {
		this.carrozzeria = carrozzeria;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
}
