package com.omeganumeric.microcommerce.models;

import com.omeganumeric.microcommerce.enums.ModeDePaiement;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Entity
public class Paiement extends AuditModel {

    @Enumerated(EnumType.STRING)
    private ModeDePaiement modeDePaiement;

    private String transactionId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehicule_id", nullable = false)
    private Vehicule vehicule;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "telephone_id", nullable = true)
    private Telephone telephone;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "taxe_id", nullable = false)
    private Taxe taxe;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tvm_user_id", nullable = false)
    private TvmUser tvmUser;

    private Long montantDu;
    private Long montantPenalite;
    @Size(max = 12)
    @Nullable()
    private String autreNumeroDeTelephone;

    public ModeDePaiement getModeDePaiement() {
        return modeDePaiement;
    }

    public void setModeDePaiement(ModeDePaiement modeDePaiement) {
        this.modeDePaiement = modeDePaiement;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public Taxe getTaxe() {
        return taxe;
    }

    public void setTaxe(Taxe taxe) {
        this.taxe = taxe;
    }

    public TvmUser getTvmUser() {
        return tvmUser;
    }

    public void setTvmUser(TvmUser tvmUser) {
        this.tvmUser = tvmUser;
    }

    public Long getMontantDu() {
        return montantDu;
    }

    public void setMontantDu(Long montantDu) {
        this.montantDu = montantDu;
    }

    public Long getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(Long montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public String getAutreNumeroDeTelephone() {
        return autreNumeroDeTelephone;
    }

    public void setAutreNumeroDeTelephone(String autreNumeroDeTelephone) {
        this.autreNumeroDeTelephone = autreNumeroDeTelephone;
    }
}
