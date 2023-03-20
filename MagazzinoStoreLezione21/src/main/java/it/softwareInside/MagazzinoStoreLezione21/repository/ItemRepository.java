package it.softwareInside.MagazzinoStoreLezione21.repository;

import org.springframework.data.repository.CrudRepository;

import it.softwareInside.MagazzinoStoreLezione21.models.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
