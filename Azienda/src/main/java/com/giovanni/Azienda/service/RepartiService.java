package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import com.giovanni.Azienda.model.Reparti;

public interface RepartiService {
	void saveReparti(Reparti reparti);
	List<Reparti> getAll();
	Optional<Reparti> findById(int id);
	void deleteReparti(Reparti reparti);
	List<String[]> findQtaImpXRep(int id);
}
