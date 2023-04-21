package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;
import com.giovanni.Azienda.model.Turni;

public interface TurniService {

	void saveTurni(Turni turni);
	List<Turni> getAll();
	Optional<Turni> findById(int id);
	void deleteTurni(Turni turni);
	
}

