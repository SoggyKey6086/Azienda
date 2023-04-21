package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;
import com.giovanni.Azienda.model.Permesso;

public interface PermessoService {

	void savePermesso(Permesso permesso);
	List<Permesso> getAll();
	Optional<Permesso> findById(int id);
	void deletePermesso(Permesso permesso);
	List<String []> findQtaPermessiPerRuolo(int id);
}