package com.omeganumeric.microcommerce.repositories;

import com.omeganumeric.microcommerce.models.TypeTaxe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeTaxeRepository extends JpaRepository<TypeTaxe,Long> {
    public TypeTaxe findByCode();
}
