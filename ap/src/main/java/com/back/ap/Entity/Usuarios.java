/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.ap.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Usuarios  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String titulo;
    @NotNull
    @Column(length = 1000)
    private String descripcion;
    private String fotoPerfil;

    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills> skillList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idAb")
    private List<About> aboutList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSoc")
    private List<Social> socialList;

    public Usuarios() {
    }

    public Usuarios(String nombre, String titulo, String descripcion, String fotoPerfil, List<Educacion> educacionList, List<Experiencia> experienciaList, List<Skills> skillList, List<About> aboutList, List<Social> socialList) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
        this.educacionList = educacionList;
        this.experienciaList = experienciaList;
        this.skillList = skillList;
        this.aboutList = aboutList;
        this.socialList = socialList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public List<Educacion> getEducacionList() {
        return educacionList;
    }

    public void setEducacionList(List<Educacion> educacionList) {
        this.educacionList = educacionList;
    }

    public List<Experiencia> getExperienciaList() {
        return experienciaList;
    }

    public void setExperienciaList(List<Experiencia> experienciaList) {
        this.experienciaList = experienciaList;
    }

    public List<Skills> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skills> skillList) {
        this.skillList = skillList;
    }

    public List<About> getAboutList() {
        return aboutList;
    }

    public void setAboutList(List<About> aboutList) {
        this.aboutList = aboutList;
    }

    public List<Social> getSocialList() {
        return socialList;
    }

    public void setSocialList(List<Social> socialList) {
        this.socialList = socialList;
    }
    
    
    
    
    
}
