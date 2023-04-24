package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.Impiegati;
import com.giovanni.Azienda.repository.ImpiegatiRepository;
import com.giovanni.Azienda.service.ImpiegatiService;

@Service
public class ImpiegatiServiceImpl implements ImpiegatiService {
	
	@Autowired
	ImpiegatiRepository ir;

	@Override
	public void saveImpiegati(Impiegati impiegati) {
		ir.save(impiegati);

	}

	@Override
	public List<Impiegati> getAll() {
		return ir.findAll();
	}

	@Override
	public Optional<Impiegati> findById(int id) {
		return ir.findById(id);
	}

	@Override
	public void deleteImpiegati(Impiegati impiegati) {
		ir.delete(impiegati);
	}

	@Override
	public Optional<Impiegati> findByIdRepName(int id) {
		return ir.findByIdRepName(id);
	}

}
