package com.univlittoral.projetback.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.GenresDTO;
import com.univlittoral.projetback.dto.HomeDTO;

import com.univlittoral.projetback.dto.IndicateursDTO;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.model.LivreDO;


@RestController
@RequestMapping(value = "rest/bd/home/")
@Transactional
public class HomeBD {

    @Autowired
    private LivreBO livreBO;
    @Autowired
    private AuteurBO auteurBO;
    
    @GetMapping(value ="/")
    public HomeDTO getHomePage() {

   
        final List<LivreDO> entities = livreBO.findAll();
        final int nbLivres = entities.size();
        final int nbAuteurs = auteurBO.findAll().size();
        final ArrayList<String> genres = new ArrayList<String>();
        final Map<String, Integer> tabListeGenre = new HashMap();

        
        for (int i = 0; i < entities.size(); i++) {
            LivreDO livre = entities.get(i);
            String genre =  livre.getGenre().toString();
          boolean contains = genres.contains(genre);
            if(!contains) {
                genres.add(genre.toString());         
            }
        }
        
        for (int i = 0; i < entities.size(); i++) {
            LivreDO livre = entities.get(i);
            String genre =  livre.getGenre().toString();
          boolean contains = tabListeGenre.containsKey(genre);
            if(!contains) {
                tabListeGenre.put(genre, 1);  
            }
            else{
            	tabListeGenre.put(genre, tabListeGenre.get(genre) + 1);
            }

        }


        final HomeDTO dto = new HomeDTO();
        final IndicateursDTO indicateur = new IndicateursDTO();
        indicateur.setNbLivres(nbLivres);
        indicateur.setNbAuteurs(nbAuteurs);
        
        dto.setLivres(new ArrayList<>(LivreMapper.map(entities)));
        dto.setIndicateurs(indicateur);
        indicateur.setNbGenres(genres.size());
        
        final GenresDTO listeGenre = new GenresDTO();
        listeGenre.setListeGenre(tabListeGenre);
        dto.setGenres(tabListeGenre);
        
        return dto;

    }
}