package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.giovanni.Azienda.model.Presenze;
import com.giovanni.Azienda.repository.PresenzeRepository;
import com.giovanni.Azienda.service.PresenzeService;

public class PresenzeServiceImpl implements PresenzeService{
	
	@Autowired
	PresenzeRepository prer;

	@Override
	public void savePresenze(Presenze presenze) {
		prer.save(presenze);
	}

	@Override
	public List<Presenze> getAll() {
		return prer.findAll();
	}

	@Override
	public Optional<Presenze> findById(int id) {
		return prer.findById(id);
	}

	@Override
	public void deletePresenze(Presenze presenze) {
		prer.delete(presenze);
	}

	@Override
	public List<String[]> findQtaPresenze(int id) {
		return prer.findQtaPresenze(id);
	}

	@Override
	public List<String[]> findQtaAssenze(int id) {
		return prer.findQtaAssenze(id);
	}

	@Override
	public List<String[]> findOrePermessi(int id) {
		return prer.findOrePermessi(id);
	}
}
