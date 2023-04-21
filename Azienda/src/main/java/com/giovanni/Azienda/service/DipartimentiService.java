package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.Dipartimenti;

@Service
public interface DipartimentiService {

	void saveDipartimenti(Dipartimenti Dipartimenti);
	List<Dipartimenti> getAll();
	Optional<Dipartimenti> findById(int id);
	void deleteDipartimenti(Dipartimenti Dipartimenti);
	Optional<Dipartimenti> findQtaImpXImp(int idDip);
	
}
