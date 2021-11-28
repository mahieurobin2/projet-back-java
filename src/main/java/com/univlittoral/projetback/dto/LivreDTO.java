package com.univlittoral.projetback.dto;

import java.util.Date;

import com.univlittoral.projetback.enums.GenreEnum;
import com.univlittoral.projetback.model.AuteurDO;

public class LivreDTO {
	private Long id;
	private String nom;
	private String editeur;
	private int nbPages;
	private Date dateParution;
	private String lieuParution;
	private  GenreEnum genre;
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
    public void setAuteur(AuteurDO long1) {
        this.auteur = long1;
    }
	
}
