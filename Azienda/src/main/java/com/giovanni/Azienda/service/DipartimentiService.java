package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import com.giovanni.Azienda.model.Dipartimenti;


public interface DipartimentiService {

	void saveDipartimenti(Dipartimenti Dipartimenti);
	List<Dipartimenti> getAll();
	Optional<Dipartimenti> findById(int id);
	void deleteDipartimenti(Dipartimenti Dipartimenti);
	List<String[]> findQtaImpXImp(int idDip);
	
}
