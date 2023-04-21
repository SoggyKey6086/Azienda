package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.giovanni.Azienda.model.Turni;
import com.giovanni.Azienda.repository.TurniRepository;
import com.giovanni.Azienda.service.TurniService;

@Service
public class TurniServiceImpl implements TurniService {
	
	@Autowired
	TurniRepository ts;

	@Override
	public void saveTurni(Turni turni) {
		ts.save(turni);
	}

	@Override
	public List<Turni> getAll() {
		return ts.findAll();
	}

	@Override
	public Optional<Turni> findById(int id) {
		return ts.findById(id);
	}

	@Override
	public void deleteTurni(Turni turni) {
		ts.delete(turni);
	}
}