package it.softwareInside.esercizioPdf1;

import java.util.ArrayList;

public class Archivio {

	
	private ArrayList<Documento> documenti;
	
	public Archivio() {
		this.documenti = new ArrayList<>();
	}
	
	
	public ArrayList<Documento> getDocumenti() {
		return documenti;
	}
	
	
	public void aggiungiDocumenti(Documento documento) {
		
		if(documento == null)
			return ;
		
		this.documenti.add(documento);
		
//		if(documento != null) {
//			this.documenti.add(documento);
//		}
		
	}
	
	
	
	public Documento trovaMigliore() {
	
		
		Documento documentoMigliore = this.documenti.get(0);
		
		for (int i = 0; i < this.documenti.size(); i++) {
			
			
			if(this.documenti.get(i).calcolaQualita()  > documentoMigliore.calcolaQualita() ) {
				documentoMigliore = this.documenti.get(i);
			}
			
			
		}
		
		//remove to array to arraylist
		this.documenti.remove(documentoMigliore);
		
		
		return documentoMigliore;
	}
	
	
	
	
	
	
	
}
