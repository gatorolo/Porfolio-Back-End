/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.ap.Services;

import com.back.ap.Entity.About;
import com.back.ap.Repository.AboutRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AboutService {
    private final AboutRepo aboutRepo;
    
     @Autowired
    public AboutService(AboutRepo aboutRepo) {
        this.aboutRepo = aboutRepo;
}
    public About addAbout(About about){
        return aboutRepo.save(about);
    }
    public List<About> buscarAbout(){
        return aboutRepo.findAll();
    }
    public About editarAbout(About about){
        return aboutRepo.save(about);
    }
    public void borrarAbout(Long id){
           aboutRepo.deleteById(id);
    }
    
}
