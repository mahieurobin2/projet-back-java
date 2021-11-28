package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.model.AuteurDO;



@RestController
@RequestMapping(value = "/rest/bd/auteurs/")
@Transactional

public class AuteurBD {
	@Autowired
    private AuteurBO auteurBO;
	
	@GetMapping
    final List<AuteurDTO> getAuteur() {
        final List<AuteurDO> auteursDO = auteurBO.findAll();
        return AuteurMapper.map(auteursDO);
    }
	
	@GetMapping(value="{id}")
    final AuteurDTO getAuteur(@PathVariable Long id) {
        
        final AuteurDO entities = auteurBO.findOne(id);
        
         return AuteurMapper.map(entities);
        
    }
	
	 @PostMapping(value = "/")
	    void postAuteur(@RequestBody AuteurDTO auteurRequestDTO) {
	        final AuteurDO auteurDO = new AuteurDO();

	        auteurDO.setId(auteurRequestDTO.getId());
	        auteurDO.setNom(auteurRequestDTO.getNom());
	        auteurDO.setPrenom(auteurRequestDTO.getPrenom());
	        auteurDO.setDateNaissance(auteurRequestDTO.getDateNaissance());

	        auteurBO.saveOne(auteurDO);
	    }
	 
	 @PutMapping(value="{id}")
		final void UpdateUtilisateur(@RequestBody AuteurDTO update, @PathVariable Long id) {
			final AuteurDO userdo = auteurBO.findOne(id);
			userdo.setNom(update.getNom());
			userdo.setPrenom(update.getPrenom());
			userdo.setDateNaissance(update.getDateNaissance());
			auteurBO.saveOne(userdo);
		}
	 
	 @DeleteMapping(value="{id}") 
		void DeleteUtilisateur(@PathVariable Long id) {
			final AuteurDO user = auteurBO.findOne(id);
			auteurBO.deleteOne(user);
		}
}
