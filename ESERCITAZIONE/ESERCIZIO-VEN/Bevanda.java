public class Bevanda {
	private String nome;
	private int costoInCentesimi;
	private int qntCaffe;
	private int qntLatte;
	private int qntCacao;
	private int qntZucchero;
 
	public Bevanda(String nome, int prezzo, int caffe, int latte, int cacao, int zucchero) 
	throws ParametriNonValidiException{
		if(nome == null || prezzo < 0 || caffe < 0 || latte < 0 || cacao < 0 || zucchero < 0)
			throw new ParametriNonValidiException();
		if(caffe == 0 && latte == 0)
			throw new ParametriNonValidiException();
		this.nome = nome;
		costoInCentesimi = prezzo;
		qntCaffe = caffe;
		qntLatte = latte;
		qntCacao = cacao;
		qntZucchero = zucchero;
	}
	
	@Override
	public int hashCode(){
		return nome.hashCode();
	}
	
}
