package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import com.giovanni.Azienda.model.Impiegati;


public interface ImpiegatiService {
	void saveImpiegati(Impiegati impiegati);
	List<Impiegati> getAll();
	Optional<Impiegati> findById(int id);
	void deleteImpiegati(Impiegati impiegati);
}
