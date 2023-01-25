/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.ap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAb;
    @Column( length = 10000)
    private String sobreMi;

    public About() {
    }

    public About(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public Long getIdAb() {
        return idAb;
    }

    public void setIdAb(Long idAb) {
        this.idAb = idAb;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }
    
    
}