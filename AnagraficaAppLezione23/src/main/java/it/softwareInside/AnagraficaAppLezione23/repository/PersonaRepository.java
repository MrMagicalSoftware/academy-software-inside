package it.softwareInside.AnagraficaAppLezione23.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.softwareInside.AnagraficaAppLezione23.models.Persona;


@Repository
public interface PersonaRepository extends CrudRepository<Persona , String>{
   

    @Query("SELECT SUM(p.eta) FROM Persona p")
    int getTotalAge();

    // @Query("SELECT SUM(m.eta) FROM Persona m")
    // int sommaTotale();

    
    @Query(value = "SELECT * FROM Persona Where eta >= 25" , nativeQuery = true)
    List<Persona> getAllPersoneMaggioriDi25();
    
    
    @Query(value = "SELECT * FROM Persona Where eta >= ?1" , nativeQuery = true)
    List<Persona> getAllPersoneMaggiori(int etaPersona);
    
    
    
    
//    @Query(
//    		  value = "SELECT * FROM Users u WHERE u.status = ?1", 
//    		  nativeQuery = true)
//    		User findUserByStatusNative(Integer status);

}
