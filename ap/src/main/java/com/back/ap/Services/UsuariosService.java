/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.ap.Services;

import com.back.ap.Entity.Usuarios;
import com.back.ap.Exception.UserNotFoundException;
import com.back.ap.Repository.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UsuariosService {
    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuariosService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

   
    
    public Usuarios addUsuario(Usuarios usuarios){
        return usuarioRepo.save(usuarios);
    }
    public List<Usuarios> buscarUsuario(){
        return usuarioRepo.findAll();
    }
    public Usuarios editarUsuario(Usuarios usuarios){
        return usuarioRepo.save(usuarios);
    }
    public void borrarUsuario(Long id){
           usuarioRepo.deleteById(id);
    }
    
    public Usuarios buscarUsuarioPorId(Long id){
        return usuarioRepo.findById(id).orElseThrow(() -> new UserNotFoundException("usuario no encontrado"));
    }


   
}
