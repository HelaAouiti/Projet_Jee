package spring.pfa.repository;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.pfa.model.Administrateur;
import spring.pfa.model.Conge;
import spring.pfa.model.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
	Employe findByMail(String mail);
	Page<Employe> findall(Pageable pageable);
	@Query("SELECT DISTINCT e FROM Employe e JOIN e.conge c WHERE e.nom = :z AND (c.dateDebut = :y OR c.etat LIKE :x)")
	Page<Employe> findByEmployeOrDateOrEtat(@Param("z") String nom, @Param("y") LocalDate date, @Param("x") String etat, Pageable pageable);
	

}
