package it.softwareInside.NoteAppLezione22.controller;

import java.io.ByteArrayInputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.NoteAppLezione22.models.Nota;
import it.softwareInside.NoteAppLezione22.util.GeneratePdf;


@RestController
public class RestControllerNota {

	
	

    @RequestMapping(value = "/pdf", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> generaNota(@RequestParam("id") int id ,
    		@RequestParam("testo") String testo , @RequestParam("autore") String autore) {

       
    	Nota nota = new Nota(id, testo, autore);
    	
    	try {
    		
    		GeneratePdf generatePdf = new GeneratePdf();

            ByteArrayInputStream bis =  generatePdf.generaPDFNota(nota) ; 

            var headers = new HttpHeaders();
            headers.add("Content-Disposition", "inline; filename=example.pdf");
    		
            
            
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .contentType(MediaType.APPLICATION_PDF)
                    .body(new InputStreamResource(bis));
    		
    	}catch (Exception e) {
			return null;
    	
    
    	}
	
    }
    
    
}
