package com.giovanni.Azienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Turni;

@Repository("turniRepository")
public interface TurniRepository extends JpaRepository<Turni, Integer> {

}
