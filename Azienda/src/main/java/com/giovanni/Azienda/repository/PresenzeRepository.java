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
	
	@Query(value = "SELECT Impiegati.id_imp, Impiegati.nome, Impiegati.cognome, SUM(TIME_TO_SEC(TIMEDIFF(Presenze.orario_fine, Presenze.orario_inizio))/3600) AS Numero_Ore_Lavorate\r\n"
			+ "FROM Presenze\r\n"
			+ "JOIN Impiegati ON Presenze.id_imp = Impiegati.id_imp\r\n"
			+ "WHERE Presenze.data BETWEEN ?1 AND  ?2\r\n"
			+ "GROUP BY Impiegati.id_imp, Impiegati.nome, Impiegati.cognome", nativeQuery= true)
	public List<String[]> findByIdImp(int idPre);
}
