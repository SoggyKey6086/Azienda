package com.giovanni.Azienda.service;

import java.util.List;
import java.util.Optional;

import com.giovanni.Azienda.model.Salario;

public interface SalarioService {
	void saveSalario(Salario salario);
	List<Salario> getAll();
	Optional<Salario> findById(int id);
	void deleteImpiegati(Salario salario);
}
