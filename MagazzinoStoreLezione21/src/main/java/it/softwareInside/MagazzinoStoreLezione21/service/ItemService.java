package it.softwareInside.MagazzinoStoreLezione21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.MagazzinoStoreLezione21.models.Item;
import it.softwareInside.MagazzinoStoreLezione21.repository.ItemRepository;

@Service
public class ItemService {
	
	

	@Autowired
	ItemRepository itemRepository;

	
	/**
	 * 
	 * Metodo che prende in ingresso un object di tipo item
	 * diverso da null .. ritorna true se 
	 * l'item è stato aggiunto altrimenti ritorna false.
	 * 
	 * Nota : posso usare addItem anche per gli update
	 * 
	 * @param item
	 * @return
	 */
	public boolean addItem(Item item) {
		
		
		if(item == null)
			return false;
		
		try {
		
			itemRepository.save(item);
			
			return true;
			
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
		
	}
	
	
	
	public boolean update(Item item) {
		
		return addItem(item);
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Item deleteItem(int id) {
		
		try {
			
			Item item = itemRepository.findById(id).get();
			
			itemRepository.deleteById(id);
			
			return item;
			
			
		}catch (Exception e) {
			
			System.out.println(e);
			
			return null;
		}
		
		
	}
	
	
	public Item getItemById(int id) {
		
		try {
			
			return itemRepository.findById(id).get();
			
		}catch (Exception e) {
			return null;
		}
		
	}
	
	
	public Iterable<Item> getAllData() {
		
		
		return itemRepository.findAll();
	}
	
	
	
	public double calcolaValoreTotaleMagazzino() {
		
		double sommaTotale = 0 ;
		
		for(Item item  : itemRepository.findAll() )
			sommaTotale += item.getPrezzo();
		
		
		return sommaTotale;
	}
	
	
	
}
