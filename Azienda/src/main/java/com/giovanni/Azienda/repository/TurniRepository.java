package com.giovanni.Azienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Turni;

@Repository("turniRepository")
public interface TurniRepository extends JpaRepository<Turni, Integer> {
	
	@Query(value = "Select * from turni where idT = ?1", nativeQuery = true)
	Optional<Turni> findById(long idT);
}
