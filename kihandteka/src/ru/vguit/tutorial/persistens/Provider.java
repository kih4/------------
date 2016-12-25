/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.persistens;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность, которая будет маппитьсяв БД
 * 
 * @author a.pleshkanev
 */
    @Entity
    @Table(name="Provider")
    public class Provider implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="Name")
        private String name;

        @Column(name="Representative")
        private String representative;
        
        @Column(name="Post")
        private String post;
        
        @Column(name="City")
        private String city;
        
        @Column(name="telephone")
        private String telephone;
        
        

    public Provider() {
    }

    public Provider(String name, String representative, String post, String city, String telephone) {
        this.name = name;
        this.representative = representative;
        this.post = post;
        this.city = city;
        this.telephone = telephone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRepresentative() {
        return representative;
    }

    public String getPost() {
        return post;
    }

    public String getCity() {
        return city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
        
        

        @Override
        public String toString() {
            return String.format("(%s, %s, %s, %s, %s,%s)", this.name,this.telephone,this.city,this.post,this.representative,this.id);
        }
    }

