package com.giovanni.Azienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Dipartimenti;

@Repository("dipartimentiRepository")
public interface DipartimentiRepository extends JpaRepository<Dipartimenti, Integer>{
	
	@Query(value = "Select * from dipartimenti where  = ?1", nativeQuery = true)
	public Optional<Dipartimenti> findById(Integer idDip);
	
	@Query(value = "SELECT dipartimenti.nome AS dipartimenti, COUNT(*) AS totale_impiegati FROM dipartimenti INNER JOIN impiegati  ON "
			+ "dipartimenti.id_dip = impiegati.id_dip GROUP BY dipartimenti.nome", nativeQuery = true)
	public List<String[]> findQtaImpXImp(int idDip);
	

}
