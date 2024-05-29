package spring.pfa.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity
public class Administrateur extends Utilisateur {
	

	public Administrateur(String code, String nom, String prenom, LocalDate dateEmbauchement,
			@Size(min = 6, max = 10, message = "Le mot de passe doit contenir entre 6 et 10 caractères.") String password) {
		super(code, nom, prenom, dateEmbauchement, password);
		// TODO Auto-generated constructor stub
	}
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}



}
