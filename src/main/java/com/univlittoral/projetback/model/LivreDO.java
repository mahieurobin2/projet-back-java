package com.univlittoral.projetback.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.univlittoral.projetback.enums.GenreEnum;


@Entity
@Table(name="livres")public class LivreDO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="EDITEUR")
	private String editeur;
	
	
	@Column(name="NBPAGES")
	private int nbPages;
	
	@Column(name="DATEPARUTION")
	private Date dateParution;
	
	@Column(name="LIEUPARUTION")
	private String lieuParution;
	
	@Column(name="GENRE")
	@Enumerated(EnumType.STRING)
	private GenreEnum genre;

	@ManyToOne()
    @JoinColumn(name="auteur_id", referencedColumnName = "id")    
    private AuteurDO auteur;
	
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

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public Date getDateParution() {
		return dateParution;
	}

	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}

	public String getLieuParution() {
		return lieuParution;
	}

	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}

	public GenreEnum getGenre() {
		return genre;
	}

	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}
	
	public AuteurDO getAuteur() {
        return auteur;
    }

    public void setAuteur(AuteurDO auteurDO) {
        this.auteur = auteurDO;
    }
	
	
}
