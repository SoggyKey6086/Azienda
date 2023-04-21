package com.giovanni.Azienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Ruoli;

@Repository("RuoliRepository")
public interface RuoliRepository extends JpaRepository<Ruoli, String> {

	@Query(value = "Select * from ruoli where impiegato = ?1", nativeQuery = true)
	public Optional<Ruoli> findById(int idR);

}