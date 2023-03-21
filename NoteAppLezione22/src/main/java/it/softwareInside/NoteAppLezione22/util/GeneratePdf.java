package it.softwareInside.NoteAppLezione22.util;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;

import it.softwareInside.NoteAppLezione22.models.Nota;
import jakarta.validation.Valid;


public class GeneratePdf {
	
	
	
	  public  ByteArrayInputStream generaPDFNota(@Valid Nota nota) {

	        Document document = new Document();
	        ByteArrayOutputStream out = new ByteArrayOutputStream();

	        try {
	            
	            Paragraph contenuto = new Paragraph();
	            contenuto.add("ok PDF.......");
	            
	            Chunk linebreak = new Chunk(new DottedLineSeparator());
	            
	            contenuto.add("Author :" + nota.getAutore());
	            contenuto.add(linebreak);
	            contenuto.add("testo :" + nota.getTesto());
	            
	            
	            
	            PdfWriter.getInstance(document, out);
	            document.open();
	            document.add(contenuto);
	            document.close();

	        } catch (DocumentException ex) {

	           return null;
	        }

	        return new ByteArrayInputStream(out.toByteArray());
	    }
	
	

}
