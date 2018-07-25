package com.omeganumeric.microcommerce.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Echeance extends AuditModel {

    private Date dateLimite;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "annee_fiscale_id", nullable = false)
    private AnneeFiscale anneeFiscale;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_taxe_id", nullable = false)
    private TypeTaxe typeTaxe;

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public AnneeFiscale getAnneeFiscale() {
        return anneeFiscale;
    }

    public void setAnneeFiscale(AnneeFiscale anneeFiscale) {
        this.anneeFiscale = anneeFiscale;
    }

    public TypeTaxe getTypeTaxe() {
        return typeTaxe;
    }

    public void setTypeTaxe(TypeTaxe typeTaxe) {
        this.typeTaxe = typeTaxe;
    }
}
