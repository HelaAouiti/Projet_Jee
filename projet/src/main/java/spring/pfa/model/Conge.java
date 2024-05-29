package spring.pfa.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Conge {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 50)
	private String description;
	@Temporal(TemporalType.DATE)
	private LocalDate dateDebut;
	@Temporal(TemporalType.DATE)
	private LocalDate dateFin;
	@Temporal(TemporalType.DATE)
	private LocalDate dateRepture;
	private String etat;
	private String valide ;
	public String getValide() {
		return valide;
	}

	public void setValide(String valide) {
		this.valide = valide;
	}
	@ManyToOne
	private Employe employeconge;
	public Conge(String description, LocalDate dateDebut, LocalDate dateFin, LocalDate dateRepture, String etat) {
		super();
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateRepture = dateRepture;
		this.etat = etat;
	}
	
	public Conge(String description, LocalDate dateDebut, LocalDate dateFin, LocalDate dateRepture, String etat, Employe employe) {
		super();
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateRepture = dateRepture;
		this.etat = etat;
		this.employeconge = employe;
	}

	public Employe getEmployeconge() {
		return employeconge;
	}

	public void setEmployeconge(Employe employeconge) {
		this.employeconge = employeconge;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public LocalDate getDateRepture() {
		return dateRepture;
	}
	public void setDateRepture(LocalDate dateRepture) {
		this.dateRepture = dateRepture;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}


}
