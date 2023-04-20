package com.giovanni.Azienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Reparti;

@Repository("repartiRepository")
public interface RepartiRepository extends JpaRepository<Reparti, Integer>{
	@Query(value = "Select * from reparti where  = ?1", nativeQuery = true)
	Optional<Reparti> findById(Integer idRep);
}
