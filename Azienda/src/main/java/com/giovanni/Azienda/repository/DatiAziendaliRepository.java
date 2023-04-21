package com.giovanni.Azienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.DatiAziendali;

@Repository
public interface DatiAziendaliRepository extends JpaRepository <DatiAziendali, Integer>{
//	
//	@Query(value="Select * from datiaziendali where reparto = ?1", nativeQuery =true)
//	
//	
//	@Query(value="Select * from ")
	
}
