package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.Ruoli;
import com.giovanni.Azienda.repository.RuoliRepository;
import com.giovanni.Azienda.service.RuoliService;

@Service
public class RuoliServiceImpl implements RuoliService {

	@Autowired 
	RuoliRepository rur;
	
	@Override
	public void saveRuoli(Ruoli ruoli) {
		rur.save(ruoli);	
	}

	@Override
	public List<Ruoli> getAll() {
		return rur.findAll();
	}

	@Override
	public Optional<Ruoli> findById(int id) {
		return rur.findById(id);
	}

	@Override
	public void deleteRuoli(Ruoli ruoli) {
		rur.delete(ruoli);
	}
}
