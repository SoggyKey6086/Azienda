package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.Bonus;
import com.giovanni.Azienda.repository.BonusRepository;
import com.giovanni.Azienda.service.BonusService;

@Service
public class BonusServiceImpl implements BonusService {
	
	@Autowired
	BonusRepository br;

	@Override
	public void saveImpiegati(Bonus bonus) {
		br.save(bonus);

	}

	@Override
	public List<Bonus> getAll() {
		return br.findAll();
	}

	@Override
	public Optional<Bonus> findById(int id) {
		return br.findById(id);
	}

	@Override
	public void deleteImpiegati(Bonus bonus) {
		br.delete(bonus);
	}

}
