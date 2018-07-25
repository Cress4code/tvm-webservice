package com.omeganumeric.microcommerce.web.controllers;

import com.omeganumeric.microcommerce.models.Critere;
import com.omeganumeric.microcommerce.repositories.CritereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/critere")
public class CritereController {
    @Autowired
    private CritereRepository critereRepository;

    @GetMapping("")
    public List<Critere> getAllCritere() {

        return critereRepository.findAll();
    }

    @PostMapping("")
    public ResponseEntity<Critere> saveCritere(@RequestBody Critere critere) {
        Critere critere1 = critereRepository.save(critere);

        return ResponseEntity.created(null).body(critere1);

    }


    @PutMapping("/{code}")
    public ResponseEntity<Critere> modifyCritere(@PathVariable String code, @RequestBody Critere critere) {
        Critere critere1 = critereRepository.findByCode(code);
        if (critere1 != null) {
            critere.setId(critere1.getId());
            critereRepository.save(critere);
            return ResponseEntity.ok().body(critere);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/{code}")
    public ResponseEntity<Critere> getCritere(@PathVariable String code) {
        Critere critere = critereRepository.findByCode(code);
        if (critere != null) {
            return ResponseEntity.ok().body(critere);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<Void> deleteCritereCode(@PathVariable String code) {
        Critere critere = critereRepository.findByCode(code);

        if (critere != null) {
            critereRepository.delete(critere);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
