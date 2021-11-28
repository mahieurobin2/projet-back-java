package com.univlittoral.projetback.model;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="auteurs")public class AuteurDO {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ID")
		    
		private Long id;
		
		@Column(name="NOM")
		private String nom;
		
		@Column(name="PRENOM")
		private String prenom;
		
		@Column(name="DATENAISSANCE")
		private Date dateNaissance;
		
		@OneToMany(targetEntity=LivreDO.class, mappedBy="auteur",cascade=CascadeType.ALL, fetch = FetchType.LAZY)

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public Date getDateNaissance() {
			return dateNaissance;
		}

		public void setDateNaissance(Date dateNaissance) {
			this.dateNaissance = dateNaissance;
		}
		
		
		

		
}
