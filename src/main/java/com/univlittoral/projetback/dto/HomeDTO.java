package com.univlittoral.projetback.dto;

import java.util.List;
import java.util.Map;


public class HomeDTO {

    private List<LivreDTO> livres;
    private IndicateursDTO indicateur;
    private DatasGraphDTO datasGraphDTO;
    private Map<String,Integer> genres;

	
	
	public Map<String, Integer> getGenres() {
		return genres;
	}
	public void setGenres(Map<String, Integer> genres) {
		this.genres = genres;
	}
	public List<LivreDTO> getLivres() {
		return livres;
	}
	public void setLivres(List<LivreDTO> livres) {
		this.livres = livres;
	}
	public IndicateursDTO getIndicateurs() {
		return indicateur;
	}
	public void setIndicateurs(IndicateursDTO indicateur) {
		this.indicateur = indicateur;
	}
	public DatasGraphDTO getDatasGraphDTO() {
		return datasGraphDTO;
	}
	public void setDatasGraphDTO(DatasGraphDTO datasGraphDTO) {
		this.datasGraphDTO = datasGraphDTO;
	}
	
}