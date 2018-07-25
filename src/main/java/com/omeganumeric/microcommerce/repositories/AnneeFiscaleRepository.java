package com.omeganumeric.microcommerce.repositories;

import com.omeganumeric.microcommerce.models.AnneeFiscale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnneeFiscaleRepository extends JpaRepository<AnneeFiscale,Long> {
    public AnneeFiscale findByReferenceAnneeFiscale(String ref);
    public AnneeFiscale findByAnnee(int annee);
}
