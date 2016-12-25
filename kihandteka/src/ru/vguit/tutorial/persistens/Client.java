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
@Table(name="Client")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    
        @Id @GeneratedValue
        private long id;
        
        @Column(name="Family")
        private String family;

        @Column(name="Name")
        private String name;
        
        @Column(name="Lastname")
        private String lastname;
        
        @Column(name="Number")
        private String numbertelephone;
        
        @Column(name="Address")
        private String address;
        
         @Column(name="Sex")
        private String sex;
        

    public long getId() {
        return id;
    }

    public Client() {
    }

    public Client(String family, String name, String lastname, String numbertelephone, String address,String sex) {
        this.family = family;
        this.name = name;
        this.lastname = lastname;
        this.numbertelephone = numbertelephone;
        this.address = address;
        this.sex=sex;
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

    public String getNumbertelephone() {
        return numbertelephone;
    }

    public String getAddress() {
        return address;
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

    public void setNumbertelephone(String numbertelephone) {
        this.numbertelephone = numbertelephone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
@Override
        public String toString() {
            return String.format("(%s, %s,%s,%s,%s,%s)", this.name, this.family,this.lastname,this.numbertelephone,this.address,this.sex);
        }
}
