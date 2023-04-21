package com.giovanni.Azienda.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giovanni.Azienda.model.Permesso;
import com.giovanni.Azienda.repository.PermessoRepository;
import com.giovanni.Azienda.service.PermessoService;

@Service
public class PermessoServiceImpl implements PermessoService {

	@Autowired
	PermessoRepository pr;
	
	@Override
	public void savePermesso(Permesso permesso) {
		pr.save(permesso);
	}

	@Override
	public List<Permesso> getAll() {
		return pr.findAll();
	}

	@Override
	public Optional<Permesso> findById(int id) {
		return pr.findById(id);
	}

	@Override
	public void deletePermesso(Permesso permesso) {
	 pr.delete(permesso);
	}

	@Override
	public List<String[]> findQtaPermessiPerRuolo(int id) {
		return pr.findQtaPermessiPerRuolo(id);
	}
}
