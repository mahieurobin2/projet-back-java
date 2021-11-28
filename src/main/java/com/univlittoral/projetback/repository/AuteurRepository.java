package com.univlittoral.projetback.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univlittoral.projetback.model.AuteurDO;

@Repository
public interface AuteurRepository extends JpaRepository<AuteurDO, Long> {
	   
}
