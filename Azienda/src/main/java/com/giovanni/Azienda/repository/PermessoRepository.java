package com.giovanni.Azienda.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.giovanni.Azienda.model.Permesso;

Repository("permessoRepository")
public interface PermessoRepository extends JpaRepository<Permesso, Integer>{
	@Query(value="Select * from permesso where idPer = ?1", nativeQuery = true) 
	Optional<Permesso> findById(int id);

	@Query"SELECT Ruoli.nome, COUNT(*) AS Numero_Permessi FROM Permesso JOIN "
	+ "Impiegati ON Permesso.id_imp = Impiegati.id_imp JOIN Ruoli ON "
	+ "Impiegati.id_r = Ruoli.id_r GROUP BY Ruoli.nome", nativeQuery = true)
}
