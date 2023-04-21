package com.giovanni.Azienda.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanni.Azienda.model.Presenze;

@Repository("presenzeRepository")
public interface PresenzeRepository extends JpaRepository<Presenze, Integer> {
	@Query(value = "Select * from reparti where  = ?1", nativeQuery = true)
	public Optional<Presenze> findById(Integer idPre);

	@Query(value = "SELECT id_imp, COUNT(*) as Numero_presenze FROM presenze GROUP BY id_imp", nativeQuery = true)
	public List<String[]> findQtaPresenze(int idPre);

	@Query(value = "SELECT impiegati.id_imp, DATEDIFF(dati_aziendali.data_assunzione, NOW()) - COUNT(Presenze.id_pre) as Numero_assenze "
			+ "FROM Impiegati JOIN dati_aziendali ON impiegati.id_imp = dati_aziendali.id_rep LEFT JOIN presenze ON "
			+ "impiegati.id_imp = presenze.id_imp GROUP BY impiegati.id_imp", nativeQuery = true)
	public List<String[]> findQtaAssenze(int idPre);
}
