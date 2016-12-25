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
    @Table(name="Drugs")
    public class Drugs implements Serializable{
        private static final long serialVersionUID = 1L;

        @Id @GeneratedValue
        private long id;

        @Column(name="NameDrug")
        private String namedrug;
        
        @Column (name="idprovider")
        private long idprovider;
        
        @Column (name="idclient")
        private long idclient;
        
        @Column (name="idemployee")
        private long idemployee;
        
        @Column (name="Unit")
        private String unit;
        
        @Column (name="Costfromprovider")
        private long costfromprovider;
        
        @Column (name="Costofselling")
        private long costofselling;

    public Drugs(String namedrug, long idprovider, long idclient, long idemployee, String unit, long costfromprovider, long costofselling) {
        this.namedrug = namedrug;
        this.idprovider = idprovider;
        this.idclient = idclient;
        this.idemployee = idemployee;
        this.unit = unit;
        this.costfromprovider = costfromprovider;
        this.costofselling = costofselling;
    }

    public Drugs() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public String getNamedrug() {
        return namedrug;
    }

    public long getIdprovider() {
        return idprovider;
    }

    public long getIdclient() {
        return idclient;
    }

    public void setNamedrug(String namedrug) {
        this.namedrug = namedrug;
    }

    public void setIdprovider(long idprovider) {
        this.idprovider = idprovider;
    }

    public void setIdclient(long idclient) {
        this.idclient = idclient;
    }

    public void setIdemployee(long idemployee) {
        this.idemployee = idemployee;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setCostfromprovider(long costfromprovider) {
        this.costfromprovider = costfromprovider;
    }

    public void setCostofselling(long costofselling) {
        this.costofselling = costofselling;
    }

    public long getIdemployee() {
        return idemployee;
    }

    public String getUnit() {
        return unit;
    }

    public long getCostfromprovider() {
        return costfromprovider;
    }

    public long getCostofselling() {
        return costofselling;
    }
        
        

        

         
         

        @Override
        public String toString() {
            return String.format("(%s, %s,%s,%s,%s,%s,%s)", this.costfromprovider,this.costofselling,this.id,this.idclient,this.idemployee,this.idprovider,this.namedrug,this.unit);
        }
    }

