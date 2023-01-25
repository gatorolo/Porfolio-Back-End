
package com.back.ap.Controller;

import com.back.ap.Entity.About;
import com.back.ap.Services.AboutService;
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
@RequestMapping("/about")
public class AboutController {
    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }
    
    @PutMapping("/update")
    public ResponseEntity<About> editarAbout(@RequestBody About about){
        About updateAbout = aboutService.editarAbout(about);
        return new ResponseEntity<>(updateAbout, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<About>> getAbout(){
        List<About> abouts = aboutService.buscarAbout();
       return new ResponseEntity<>(abouts, HttpStatus.OK);
    }

   
    @PostMapping("/add")
    public ResponseEntity<About> crearAbout(@RequestBody About about){
        About nuevaAbout=aboutService.addAbout(about);
        return new ResponseEntity<>(nuevaAbout, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
        aboutService.borrarAbout(id);
        return new ResponseEntity<>(HttpStatus.OK);
}
}
