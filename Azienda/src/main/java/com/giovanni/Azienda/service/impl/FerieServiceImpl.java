package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.Ferie;
import com.giovanni.Azienda.repository.FerieRepository;
import com.giovanni.Azienda.service.FerieService;

@Service
public class FerieServiceImpl implements FerieService {

	@Autowired
	FerieRepository fr;
	
	
	@Override
	public void saveFerie(Ferie ferie) {
		fr.save(ferie);
	}

	@Override
	public List<Ferie> getAll() {
		return fr.findAll();
	}

	@Override
	public Optional<Ferie> findById(int id) {
		return fr.findById(id);
	}

	@Override
	public void deleteFerie(Ferie ferie) {
		fr.delete(ferie);
	}

}