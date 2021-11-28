package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.model.LivreDO;



public class LivreMapper {
	public final static List<LivreDTO> map(final List<LivreDO> entities) {
        final List<LivreDTO> listLivre = new ArrayList<LivreDTO>();
        if (null == entities) {
            return null;
        }
        for(LivreDO livreDO : entities) {         
            listLivre.add(map(livreDO));
        }
        return listLivre;
    }
    
    public final static LivreDTO map(final LivreDO livreDO) {
        final LivreDTO livreDTO = new LivreDTO();
        
        livreDTO.setNom(livreDO.getNom());
        livreDTO.setEditeur(livreDO.getEditeur());
        livreDTO.setNbPages(livreDO.getNbPages());
        livreDTO.setDateParution(livreDO.getDateParution());
        livreDTO.setLieuParution(livreDO.getLieuParution());
        livreDTO.setGenre(livreDO.getGenre());
        livreDTO.setId(livreDO.getId());
        livreDTO.setAuteur(livreDO.getAuteur()); 

        
        return livreDTO;
    }
    

}
