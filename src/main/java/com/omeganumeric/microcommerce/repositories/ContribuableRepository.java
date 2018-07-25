package com.omeganumeric.microcommerce.repositories;

import com.omeganumeric.microcommerce.models.Contribuable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContribuableRepository extends JpaRepository<Contribuable,Long> {
}
