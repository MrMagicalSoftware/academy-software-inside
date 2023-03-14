import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor


public class Rivista extends Libro {

	private int numeroRivista;

	public Rivista(String titolo, int pagine,int numeroRivista) {
		super(titolo, pagine);
		setNumeroRivista(numeroRivista);
	}
	
	
	
}
