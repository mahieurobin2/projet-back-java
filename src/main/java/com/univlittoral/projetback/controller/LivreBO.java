package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.enums.GenreEnum;
import com.univlittoral.projetback.model.LivreDO;
import com.univlittoral.projetback.repository.LivreRepository;


@Service
public class LivreBO {
	@Autowired
	private LivreRepository repo;
	
	public List<LivreDO> findAll() {
		return repo.findAll();
	}

	public LivreDO findOne(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	
	public void saveOne(LivreDO livre) {
		repo.save(livre);
	}
	
	public void deleteOne(LivreDO livre) {
		repo.delete(livre);
	}
	
	//public List<LivreDO> findByType(GenreEnum type){
		//return LivreRepository.findByType(type);
	//}
}
