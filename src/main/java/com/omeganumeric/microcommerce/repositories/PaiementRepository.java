package com.omeganumeric.microcommerce.repositories;

import com.omeganumeric.microcommerce.models.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
