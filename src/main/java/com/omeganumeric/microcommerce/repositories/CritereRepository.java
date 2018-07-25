package com.omeganumeric.microcommerce.repositories;

import com.omeganumeric.microcommerce.models.Critere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CritereRepository extends JpaRepository<Critere,Long> {
    public Critere findByCode(String code);
}
