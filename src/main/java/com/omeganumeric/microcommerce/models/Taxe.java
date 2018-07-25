package com.omeganumeric.microcommerce.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Taxe extends AuditModel {

    private Long montant;
    private int max;
    private int min;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_taxe_id", nullable = false)
    private TypeTaxe typeTaxe;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "annee_fiscale_id", nullable = false)
    private AnneeFiscale anneeFiscale;

    @OneToMany(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "taxe")
    private List<Paiement> paiements;

    public Long getMontant() {
        return montant;
    }

    public void setMontant(Long montant) {
        this.montant = montant;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public TypeTaxe getTypeTaxe() {
        return typeTaxe;
    }

    public void setTypeTaxe(TypeTaxe typeTaxe) {
        this.typeTaxe = typeTaxe;
    }

    public AnneeFiscale getAnneeFiscale() {
        return anneeFiscale;
    }

    public void setAnneeFiscale(AnneeFiscale anneeFiscale) {
        this.anneeFiscale = anneeFiscale;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
}
