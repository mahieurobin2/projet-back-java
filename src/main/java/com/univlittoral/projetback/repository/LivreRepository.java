package com.univlittoral.projetback.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univlittoral.projetback.enums.GenreEnum;
import com.univlittoral.projetback.model.LivreDO;

@Repository
public interface LivreRepository extends JpaRepository<LivreDO, Long> {
	
}
