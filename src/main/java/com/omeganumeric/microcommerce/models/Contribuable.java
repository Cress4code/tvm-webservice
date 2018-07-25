package com.omeganumeric.microcommerce.models;

import javax.persistence.*;

@Entity
public class Contribuable extends AuditModel {


    private String ifu;
    private String raisonSociale;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "contribuable")
    private TvmUser tvmUser;

    public String getIfu() {
        return ifu;
    }

    public void setIfu(String ifu) {
        this.ifu = ifu;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public TvmUser getTvmUser() {
        return tvmUser;
    }

    public void setTvmUser(TvmUser tvmUser) {
        this.tvmUser = tvmUser;
    }
}
