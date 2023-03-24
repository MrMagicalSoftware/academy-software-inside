public class Ingredienti {
	public static final int QNT_INIZIALE = 10;
	private int caffe;
	private int latte;
	private int cacao;
	private int zucchero;
 
	public Ingredienti() {
		riempi();
	}
 
	public void riempi(){
		caffe = QNT_INIZIALE;
		latte = QNT_INIZIALE;
		cacao = QNT_INIZIALE;
		zucchero = QNT_INIZIALE;
	}

}
