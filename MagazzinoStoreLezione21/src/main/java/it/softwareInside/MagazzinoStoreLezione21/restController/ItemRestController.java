package it.softwareInside.MagazzinoStoreLezione21.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.MagazzinoStoreLezione21.models.Item;
import it.softwareInside.MagazzinoStoreLezione21.service.ItemService;

@RestController
public class ItemRestController {

	@Autowired
	ItemService itemService;
	
	
	
	
	@DeleteMapping("/delete")
	public Item delete(@RequestParam("id") int id) {
		
		
		return itemService.deleteItem(id);
	}
	
	@GetMapping("/getAll")
	public Iterable<Item> getAll(){
		return itemService.getAllData();
	}
	
	
	@GetMapping("/somma")
	public double getSum(){
		
		return itemService.calcolaValoreTotaleMagazzino();
	}
	
	
	
	
	@PostMapping("/add")
	public String addItem(@RequestBody Item item) {
		
		System.out.println("#############à");
		System.out.println(item);
		
		if(itemService.addItem(item)) 
			return "OK AGGIUNTO UN NUOVO ELEMENTO";
		
		
		return "NON POSSO AGGIUNGERE ITEM " + item;
	}
	
	
	@PostMapping("/update")
	public String updateItem(@RequestBody Item item) {
		
		if(itemService.addItem(item)) 
			return "OK Modifica";
		
		
		return "NON POSSO fare l'update ITEM  " + item;
	}
	
	
	
}
