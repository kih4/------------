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


@Entity
@Table(name="Employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id @GeneratedValue
        private long id;
        
        @Column(name="Family")
        private String family;

        @Column(name="Name")
        private String name;
        
        @Column(name="Lastname")
        private String lastname;
        
        @Column(name="Post")
        private String post;
        
        @Column(name="Dateofbirth")
        private String dateofbirth;
        
        @Column(name="Dateofrecruitment")
        private String dateofrecruitment;
        
        @Column(name="City")
        private String city;
         
         @Column(name="Wages")
         private long wages;

    public Employee() {
    }

    public Employee(String family, String name, String lastname, String post, String dateofbirth, String dateofrecruitment, String city, long wages) {
        this.family = family;
        this.name = name;
        this.lastname = lastname;
        this.post = post;
        this.dateofbirth = dateofbirth;
        this.dateofrecruitment = dateofrecruitment;
        this.city = city;
        this.wages = wages;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPost() {
        return post;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getDateofrecruitment() {
        return dateofrecruitment;
    }

    public String getCity() {
        return city;
    }

    public long getWages() {
        return wages;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setDateofrecruitment(String dateofrecruitment) {
        this.dateofrecruitment = dateofrecruitment;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWages(long wages) {
        this.wages = wages;
    }
        
     

   
        
@Override
        public String toString() {
            return String.format("(%s, %s,%s,%s, %s,%s,%s, %s,%s)",this.city,this.dateofbirth,this.dateofrecruitment,this.family,this.id,this.lastname,this.name,this.post,this.wages);
        }
}
