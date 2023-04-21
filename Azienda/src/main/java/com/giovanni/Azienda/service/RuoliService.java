package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import com.giovanni.Azienda.model.Ruoli;

public interface RuoliService {
	
		void saveRuoli(Ruoli ruoli);
		List<Ruoli> getAll();
		Optional<Ruoli> findById(int id);
		void deleteRuoli(Ruoli ruoli);
	}