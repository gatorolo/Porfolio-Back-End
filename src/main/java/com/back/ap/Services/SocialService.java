/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.ap.Services;

import com.back.ap.Entity.Social;
import com.back.ap.Repository.SocialRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SocialService {
    
     private final SocialRepo socialRepo;
     
      @Autowired
    public SocialService(SocialRepo socialRepo) {
        this.socialRepo = socialRepo;
    }
    public Social addSocial(Social social){
        return socialRepo.save(social);
    }
    public List<Social> buscarSocial(){
        return socialRepo.findAll();
    }
    public Social editarSocial(Social social){
        return socialRepo.save(social);
    }
   
    public void borrarSocial(Long id){

        socialRepo.deleteById(id);
    }
}
