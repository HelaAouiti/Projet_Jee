package spring.pfa.model;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import jakarta.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Employe extends Utilisateur {
	@OneToMany(mappedBy = "employeconge")
	private Collection<Conge> conge = new ArrayList<Conge>();


	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String code, String nom, String prenom, LocalDate dateEmbauchement,
			@Size(min = 6, max = 10, message = "Le mot de passe doit contenir entre 6 et 10 caractères.") String password) {
		super(code, nom, prenom, dateEmbauchement, password);
	}

	public Collection<Conge> getConge() {
		return conge;
	}

	public void setConge(Collection<Conge> conge) {
		this.conge = conge;
	}

}
