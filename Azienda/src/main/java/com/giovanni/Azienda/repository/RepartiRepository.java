package com.giovanni.Azienda.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Reparti;

@Repository("repartiRepository")
public interface RepartiRepository extends JpaRepository<Reparti, Integer>{
	@Query(value = "Select * from reparti where  = ?1", nativeQuery = true)
	public Optional<Reparti> findById(Integer idRep);
	
	@Query(value = "SELECT reparti.nome AS reparti, COUNT(*) AS totale_impiegati FROM reparti INNER JOIN impiegati  ON reparti.id_rep = impiegati.id_rep GROUP BY reparti.nome", nativeQuery = true)
	public List<String[]> findQtaImpXRep(int idRep);
}
