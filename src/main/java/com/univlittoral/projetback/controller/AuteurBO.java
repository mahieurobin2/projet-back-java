package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.model.AuteurDO;
import com.univlittoral.projetback.model.LivreDO;
import com.univlittoral.projetback.repository.AuteurRepository;
import com.univlittoral.projetback.repository.LivreRepository;


@Service
public class AuteurBO {
	@Autowired
	private AuteurRepository repo;
	
	public List<AuteurDO> findAll() {
		return repo.findAll();
	}

	public AuteurDO findOne(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	
	public void saveOne(AuteurDO livre) {
		repo.save(livre);
	}
	
	public void deleteOne(AuteurDO livre) {
		repo.delete(livre);
	}
	

}
