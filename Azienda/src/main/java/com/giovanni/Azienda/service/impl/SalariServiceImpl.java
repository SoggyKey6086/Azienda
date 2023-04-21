package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.Salario;
import com.giovanni.Azienda.repository.SalariRepository;
import com.giovanni.Azienda.service.SalariService;

@Service
public class SalariServiceImpl implements SalariService {

	@Autowired
	SalariRepository sr;

	@Override
	public void saveSalari(Salario salario) {
		sr.save(salario);
	}

	@Override
	public List<Salario> getAll() {
		return sr.findAll();
	}
	@Override
	public Optional<Salario> findById(int id) {
		return sr.findById(id);
	}
	@Override
	public void deleteImpiegati(Salario salario) {
		sr.delete(salario);
	}
}