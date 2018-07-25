package com.omeganumeric.microcommerce.models;

import javax.persistence.*;

@Entity
public class Critere  extends  AuditModel{

    private String code;
    private String libelle;
    private String proprieteVehicule;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "critere")
    private TypeTaxe typeTaxe;


    public Critere() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getProprieteVehicule() {
        return proprieteVehicule;
    }

    public void setProprieteVehicule(String proprieteVehicule) {
        this.proprieteVehicule = proprieteVehicule;
    }


    public TypeTaxe getTypeTaxe() {
        return typeTaxe;
    }

    public void setTypeTaxe(TypeTaxe typeTaxe) {
        this.typeTaxe = typeTaxe;
    }

    @Override
    public String toString() {
        return "Critere{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", proprieteVehicule='" + proprieteVehicule + '\'' +
                '}';
    }
}
