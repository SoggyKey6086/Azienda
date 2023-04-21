package com.giovanni.Azienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Ferie;
@Repository("ferieRepository")
public interface FerieRepository extends JpaRepository<Ferie, String>{

	@Query(value = "SELECT impiegati.nome, impiegati.cognome, COUNT(*) AS totale_ferie " +
            "FROM ferie " +
            "INNER JOIN impiegati ON impiegati.id_imp = ferie.id_imp " +
            "GROUP BY impiegati.id_imp", 
    nativeQuery = true)
	public List<String[]> findTotImpFerie();
	
}
