package com.bouwilliams.microservicespringweb.service;

import com.bouwilliams.microservicespringweb.model.Cours;
import com.bouwilliams.microservicespringweb.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CoursServiceImpl implements CoursService {

    @Autowired
    private CoursRepository coursRepository;

    @Override
    public List<Cours> selectionnerTousLesCours() {
        List<Cours> listeDeTousLesCours = new ArrayList<Cours>();
        listeDeTousLesCours = coursRepository.findAll();
        return listeDeTousLesCours;
    }

    @Override
    public List<Cours> selectinnerTousLesCoursParPublication(boolean etat) {
        return coursRepository.findByEstPublie(etat);
    }

    @Override
    public List<Cours> selectionnerTousLesCoursContenantLeTitre(String titre) {
        return coursRepository.findByTitreContaining(titre);
    }

    @Override
    public Cours selectionnerUnCour(long id) {
        Optional<Cours> coursSelectionne = coursRepository.findById(id);

        if (!coursSelectionne.isPresent()) {
            return null;
        }
        return coursSelectionne.get();
    }

    @Override
    public Cours ajouterUnNouveauCour(Cours nouveauCours) {
        return coursRepository.save(nouveauCours);
    }

    @Override
    public Cours mettreAJourUnCour(Cours majCours) {
        return coursRepository.save(majCours);
    }

    @Override
    public void supprimerUnCour(long id) {
        coursRepository.deleteById(id);
    }
}
