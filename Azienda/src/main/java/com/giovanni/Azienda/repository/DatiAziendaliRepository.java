package com.giovanni.Azienda.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.DatiAziendali;

@Repository("datiAziendaliRepository")
public interface DatiAziendaliRepository extends JpaRepository <DatiAziendali, Integer>{
	
	@Query(value= "Select * from datiaziendali where id_DA = ?1", nativeQuery = true)
	Optional<DatiAziendali> findById(long id);
		
}
