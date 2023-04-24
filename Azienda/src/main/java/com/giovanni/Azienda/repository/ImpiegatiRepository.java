package com.giovanni.Azienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Impiegati;

@Repository("impiegatiRepository")
public interface ImpiegatiRepository extends JpaRepository<Impiegati, Integer>{
	@Query(value = "Select * from impiegati where  = ?1", nativeQuery = true)
	public Optional<Impiegati> findById(Integer idImp);
	
	@Query(value = "Select nome from reparti where id_rep = ?1", nativeQuery = true)
	public Optional<Impiegati> findByIdRepName(Integer idRep);
	
}
