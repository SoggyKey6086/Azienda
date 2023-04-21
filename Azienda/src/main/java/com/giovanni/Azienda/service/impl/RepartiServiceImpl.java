package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.giovanni.Azienda.model.Reparti;
import com.giovanni.Azienda.repository.RepartiRepository;
import com.giovanni.Azienda.service.RepartiService;

public class RepartiServiceImpl implements RepartiService {
	
	@Autowired
	RepartiRepository rr;

	@Override
	public void saveReparti(Reparti reparti) {
		rr.save(reparti);
	}

	@Override
	public List<Reparti> getAll() {
		return rr.findAll();
	}

	@Override
	public Optional<Reparti> findById(int id) {
		return rr.findById(id);
	}

	@Override
	public void deleteReparti(Reparti reparti) {
		rr.delete(reparti);
	}

	@Override
	public List<String[]> findQtaImpXRep(int id) {
		return rr.findQtaImpXRep(id);
	}

}
