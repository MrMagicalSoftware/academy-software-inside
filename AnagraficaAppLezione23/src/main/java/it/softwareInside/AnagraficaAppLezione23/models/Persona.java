package it.softwareInside.AnagraficaAppLezione23.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {

    @Id
    @Size(min = 5 , max =5 , message = "VIOLAZIONE IN CODICE FISCALE")
    private String codiceFiscale;

    @NotBlank(message = "errore in nome")
    private String nome;

    @NotBlank(message = "errore in cognome")
    private String cognome;


    @Min(value = 15 , message="eta non valida")
    private int eta;

}
