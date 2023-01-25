/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.ap.Controller;

import com.back.ap.Entity.Usuarios;
import com.back.ap.Services.UsuariosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*@CrossOrigin(origins = "https://frontap-44095.web.app")*/
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private final UsuariosService usuarioService;

    public UsuariosController(UsuariosService usuarioService) {
        this.usuarioService = usuarioService;
    }

   

   
    @GetMapping("/id/{id}")
    public ResponseEntity<Usuarios> obtenerUsuario(@PathVariable("id") Long id){
        Usuarios usuarios = usuarioService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    
    @PutMapping("/update")
    public ResponseEntity<Usuarios> editarUsuario(@RequestBody Usuarios usuarios){
        Usuarios updateUsuario=usuarioService.editarUsuario(usuarios);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
}
