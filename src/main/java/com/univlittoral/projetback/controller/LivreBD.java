package com.univlittoral.projetback.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.model.LivreDO;

@RestController
@RequestMapping(value = "/rest/bd/livres/")
@Transactional

public class LivreBD {
	@Autowired
    private LivreBO livreBO;
	
	@GetMapping
    final List<LivreDTO> getLivres() {
		
        final List<LivreDO> livreDO = livreBO.findAll();
        return LivreMapper.map(livreDO);
    }

	@GetMapping(value="{id}")
    final LivreDTO getLivre(@PathVariable Long id) {
        
        final LivreDO entities = livreBO.findOne(id);
        
         return LivreMapper.map(entities);
       
    }
	
	
	   @PostMapping(value = "/")
	    void postLivre(@RequestBody LivreDTO livreRequestDTO) {
	        final LivreDO livreDO = new LivreDO();

	        livreDO.setId(livreRequestDTO.getId());
	        livreDO.setNbPages(livreRequestDTO.getNbPages());
	        livreDO.setNom(livreRequestDTO.getNom());
	        livreDO.setEditeur(livreRequestDTO.getEditeur());
	        livreDO.setDateParution(livreRequestDTO.getDateParution());
	        livreDO.setLieuParution(livreRequestDTO.getLieuParution());
	        livreDO.setGenre(livreRequestDTO.getGenre());
	        livreDO.setAuteur(livreRequestDTO.getAuteur()); 

	        livreBO.saveOne(livreDO);
	    }

	
	@PutMapping(value="{id}")
	final void UpdateLivre(@RequestBody LivreDTO update, @PathVariable Long id) {
		final LivreDO livredo = livreBO.findOne(id);
		livredo.setId(update.getId());
	    livredo.setNbPages(update.getNbPages());
		livredo.setNom(update.getNom());
		livredo.setEditeur(update.getEditeur());
		livredo.setLieuParution(update.getLieuParution());
		livredo.setDateParution(update.getDateParution());
		livredo.setGenre(update.getGenre());
		livredo.setAuteur(update.getAuteur());     

		livreBO.saveOne(livredo);
	}
	
	
			
	@DeleteMapping(value="{id}") 
	void DeleteLivre(@PathVariable Long id) {
		final LivreDO livre = livreBO.findOne(id);
		livreBO.deleteOne(livre);
	}
	
}