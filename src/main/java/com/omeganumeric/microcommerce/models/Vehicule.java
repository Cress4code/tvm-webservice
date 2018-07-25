package com.omeganumeric.microcommerce.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Vehicule extends AuditModel {

    private String chassis;
    private Date dateMiseEnCirculation;
    private Date dateImmatriculation;
    private String immatricuation;
    private String marque;
    private int nombreDePlace;
    private String poidsCharge;
    private String poidsVide;
    private String poidsUtile;
    private int puissanceMoteur;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proprietaire_id", nullable = false)
    private Proprietaire proprietaire;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "tvmusers_a_vehicule",
            joinColumns = @JoinColumn(name = "vehicule_id"),
            inverseJoinColumns = @JoinColumn(name = "tvmuser_id")
    )
    private List<TvmUser> tvmUsers;


    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "vehicule")
    private List<Paiement> paiements;

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public Date getDateMiseEnCirculation() {
        return dateMiseEnCirculation;
    }

    public void setDateMiseEnCirculation(Date dateMiseEnCirculation) {
        this.dateMiseEnCirculation = dateMiseEnCirculation;
    }

    public Date getDateImmatriculation() {
        return dateImmatriculation;
    }

    public void setDateImmatriculation(Date dateImmatriculation) {
        this.dateImmatriculation = dateImmatriculation;
    }

    public String getImmatricuation() {
        return immatricuation;
    }

    public void setImmatricuation(String immatricuation) {
        this.immatricuation = immatricuation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getNombreDePlace() {
        return nombreDePlace;
    }

    public void setNombreDePlace(int nombreDePlace) {
        this.nombreDePlace = nombreDePlace;
    }

    public String getPoidsCharge() {
        return poidsCharge;
    }

    public void setPoidsCharge(String poidsCharge) {
        this.poidsCharge = poidsCharge;
    }

    public String getPoidsVide() {
        return poidsVide;
    }

    public void setPoidsVide(String poidsVide) {
        this.poidsVide = poidsVide;
    }

    public String getPoidsUtile() {
        return poidsUtile;
    }

    public void setPoidsUtile(String poidsUtile) {
        this.poidsUtile = poidsUtile;
    }

    public int getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public void setPuissanceMoteur(int puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public List<TvmUser> getTvmUsers() {
        return tvmUsers;
    }

    public void setTvmUsers(List<TvmUser> tvmUsers) {
        this.tvmUsers = tvmUsers;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
}
