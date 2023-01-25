/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.ap.Controller;

import com.back.ap.Entity.Social;
import com.back.ap.Services.SocialService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/social")
public class SocialController {
    
    private final SocialService socialService;
     public SocialController(SocialService socialService) {
        this.socialService = socialService;
    }
     
     
     @PutMapping("/update")
    public ResponseEntity<Social> editarSocial(@RequestBody Social social){
        Social updateSocial = socialService.editarSocial(social);
        return new ResponseEntity<>(updateSocial, HttpStatus.OK);
    }
     
      @GetMapping("/all")
    public ResponseEntity<List<Social>> getSocial(){
        List<Social>  socials = socialService.buscarSocial();
        return new ResponseEntity<>(socials, HttpStatus.OK);
    }

   
    @PostMapping("/add")
    public ResponseEntity<Social> crearSocial(@RequestBody Social social){
        Social nuevaSocial=socialService.addSocial(social);
        return new ResponseEntity<>(nuevaSocial, HttpStatus.CREATED);
    }

  
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSocial(@PathVariable("id") Long id){
        socialService.borrarSocial(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
