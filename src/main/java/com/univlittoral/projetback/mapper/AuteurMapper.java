package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.model.AuteurDO;
import com.univlittoral.projetback.model.LivreDO;



public class AuteurMapper {
	public final static List<AuteurDTO> map(final List<AuteurDO> entities) {
        final List<AuteurDTO> listAuteur = new ArrayList<AuteurDTO>();
        if (null == entities) {
            return null;
        }
        for(AuteurDO auteurDO : entities) {         
            listAuteur.add(map(auteurDO));
        }
        return listAuteur;
    }
    
    public final static AuteurDTO map(final AuteurDO auteurDO) {
        final AuteurDTO auteurDTO = new AuteurDTO();
        
        auteurDTO.setNom(auteurDO.getNom());
        auteurDTO.setPrenom(auteurDO.getPrenom());
        auteurDTO.setDateNaissance(auteurDO.getDateNaissance());
        auteurDTO.setId(auteurDO.getId());
        
        return auteurDTO;
    }
    

}
