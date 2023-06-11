package com.bouwilliams.microservicespringweb.controller;

import com.bouwilliams.microservicespringweb.model.Cours;
import com.bouwilliams.microservicespringweb.service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursController {

    @Autowired
    private CoursService coursService;

    @GetMapping("/cours")
    public List<Cours> afficherTousLesCours() {
        return coursService.selectionnerTousLesCours();
    }

    @GetMapping("/cours/{id}")
    public Cours selectionnerUnCours(@PathVariable("id") long id) {
        return coursService.selectionnerUnCour(id);
    }

    @PostMapping("/cours")
    public Cours ajouterCours(@RequestBody Cours nouveauCours) {
        return coursService.ajouterUnNouveauCour(nouveauCours);
    }

    @PutMapping("/cours")
    public Cours majCours(@RequestBody Cours majCours) {
        Cours coursAMaj = coursService.selectionnerUnCour(majCours.getId());

        if (coursAMaj != null) {
            return coursService.mettreAJourUnCour(majCours);
        }
        return null;
    }

    @DeleteMapping("/cours/{id}")
    public String supprimerUnCours(@PathVariable("id") long id) {
        Cours coursASupprimer = coursService.selectionnerUnCour(id);

        if (coursASupprimer != null) {
            coursService.supprimerUnCour(id);
            return "Le cours avec l'id " + id + " a été supprimé avec succès !";
        }
        return "Le cours avec l'id " + id + " n'existe pas et ne peut donc pas être supprimer !";
    }

}
