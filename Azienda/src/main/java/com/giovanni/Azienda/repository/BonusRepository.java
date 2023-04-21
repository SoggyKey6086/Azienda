package com.giovanni.Azienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.giovanni.Azienda.model.Bonus;

public interface BonusRepository extends JpaRepository<Bonus, Integer>{
	@Query(value = "Select * from reparti where  = ?1", nativeQuery = true)
	public Optional<Bonus> findById(Integer idB);
}
