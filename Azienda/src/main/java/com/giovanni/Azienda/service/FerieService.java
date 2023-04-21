package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;
import com.giovanni.Azienda.model.Ferie;

public interface FerieService {
	
	void saveFerie(Ferie ferie);
	List<Ferie> getAll();
	Optional<Ferie> findById(int id);
	void deleteFerie(Ferie ferie);
}

