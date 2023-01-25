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
public class Social {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long idSoc;
     @Column( length = 1000)
    private String faceSocial;
     @Column( length = 1000)
    private String instaSocial;
      @Column( length = 1000)
    private String gitSocial;
    @Column( length = 1000)
    private String linkSocial;
    @Column( length = 1000)
    private String twitSocial;
    @Column( length = 1000)
    private String whatsSocial;

    public Social() {
    }

    public Social(String faceSocial, String instaSocial, String gitSocial, String linkSocial, String twitSocial, String whatsSocial) {
        this.faceSocial = faceSocial;
        this.instaSocial = instaSocial;
        this.gitSocial = gitSocial;
        this.linkSocial = linkSocial;
        this.twitSocial = twitSocial;
        this.whatsSocial = whatsSocial;
    }

    public long getIdSoc() {
        return idSoc;
    }

    public void setIdSoc(long idSoc) {
        this.idSoc = idSoc;
    }

    public String getFaceSocial() {
        return faceSocial;
    }

    public void setFaceSocial(String faceSocial) {
        this.faceSocial = faceSocial;
    }

    public String getInstaSocial() {
        return instaSocial;
    }

    public void setInstaSocial(String instaSocial) {
        this.instaSocial = instaSocial;
    }

    public String getGitSocial() {
        return gitSocial;
    }

    public void setGitSocial(String gitSocial) {
        this.gitSocial = gitSocial;
    }

    public String getLinkSocial() {
        return linkSocial;
    }

    public void setLinkSocial(String linkSocial) {
        this.linkSocial = linkSocial;
    }

    public String getTwitSocial() {
        return twitSocial;
    }

    public void setTwitSocial(String twitSocial) {
        this.twitSocial = twitSocial;
    }

    public String getWhatsSocial() {
        return whatsSocial;
    }

    public void setWhatsSocial(String whatsSocial) {
        this.whatsSocial = whatsSocial;
    }
    
    
    
}