package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import com.giovanni.Azienda.model.Bonus;

public interface BonusService {
	void saveImpiegati(Bonus bonus);
	List<Bonus> getAll();
	Optional<Bonus> findById(int id);
	void deleteImpiegati(Bonus bonus);
}
