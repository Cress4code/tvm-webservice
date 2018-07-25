package com.omeganumeric.microcommerce.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Telephone extends AuditModel {
    private String operateurGSM;
    private String imei;
    private String adresseIp;
    private String nomDuTelephone;

    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "telephone")
    private List<Paiement> paiements;

    public String getOperateurGSM() {
        return operateurGSM;
    }

    public void setOperateurGSM(String operateurGSM) {
        this.operateurGSM = operateurGSM;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getAdresseIp() {
        return adresseIp;
    }

    public void setAdresseIp(String adresseIp) {
        this.adresseIp = adresseIp;
    }

    public String getNomDuTelephone() {
        return nomDuTelephone;
    }

    public void setNomDuTelephone(String nomDuTelephone) {
        this.nomDuTelephone = nomDuTelephone;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
}
