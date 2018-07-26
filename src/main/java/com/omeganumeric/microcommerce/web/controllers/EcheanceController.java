package com.omeganumeric.microcommerce.web.controllers;

import com.omeganumeric.microcommerce.models.Echeance;
import com.omeganumeric.microcommerce.models.TypeTaxe;
import com.omeganumeric.microcommerce.repositories.AnneeFiscaleRepository;
import com.omeganumeric.microcommerce.repositories.EcheanceRepository;
import com.omeganumeric.microcommerce.repositories.TypeTaxeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/echeance")
public class EcheanceController {
    @Autowired
    private EcheanceRepository echeanceRepository;

    @Autowired
    private TypeTaxeRepository typeTaxeRepository;

    @Autowired
    private AnneeFiscaleRepository anneeFiscaleRepository;

    @GetMapping("")
    public List<Echeance> getAllEcheance() {

        return echeanceRepository.findAll();
    }

    @GetMapping("/{typeTaxe}")
    public ResponseEntity<Echeance> getEcheanceByTypeTaxe(@PathVariable String typeTaxe) {
        TypeTaxe typeTaxe = typeTaxeRepository.findB;
        if (echeance != null) {
            return ResponseEntity.ok().body(echeance);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @PostMapping("")
    public ResponseEntity<Echeance> saveEcheance(@RequestBody Echeance echeance) {
        Echeance echeance1 = echeanceRepository.save(echeance);

        return ResponseEntity.created(null).body(echeance1);

    }


    @PutMapping("/{code}")
    public ResponseEntity<Echeance> modifyEcheance(@PathVariable String code, @RequestBody Echeance echeance) {
        Echeance echeance1 = echeanceRepository.findByCode(code);
        if (echeance1 != null) {
            echeance.setId(echeance1.getId());
            echeanceRepository.save(echeance);
            return ResponseEntity.ok().body(echeance);
        } else {
            return ResponseEntity.notFound().build();
        }

    }


    @DeleteMapping("/{code}")
    public ResponseEntity<Void> deleteEcheanceCode(@PathVariable String code) {
        Echeance echeance = echeanceRepository.findByCode(code);

        if (echeance != null) {
            echeanceRepository.delete(echeance);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
