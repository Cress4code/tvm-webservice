package com.omeganumeric.microcommerce.models;

import com.omeganumeric.microcommerce.enums.TypeTvmUser;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class TvmUser extends AuditModel {

    @Size(max = 12)
    private String phone;
    @Enumerated(EnumType.STRING)
    private TypeTvmUser typeTvmUser;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contribuable_id", nullable = true)
    private Contribuable contribuable;

    @ManyToMany(mappedBy = "tvmUsers")
    private List<Vehicule> vehicules;

    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "tvmUser")
    private List<Paiement> paiements;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TypeTvmUser getTypeTvmUser() {
        return typeTvmUser;
    }

    public void setTypeTvmUser(TypeTvmUser typeTvmUser) {
        this.typeTvmUser = typeTvmUser;
    }

    public Contribuable getContribuable() {
        return contribuable;
    }

    public void setContribuable(Contribuable contribuable) {
        this.contribuable = contribuable;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
}
