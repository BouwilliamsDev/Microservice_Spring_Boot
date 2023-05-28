package com.bouwilliams.microservicespringweb.service;

import com.bouwilliams.microservicespringweb.model.Cours;

import java.util.List;

public interface CoursService {

    List<Cours> selectionnerTousLesCours();
    List<Cours> listeTousLesCoursParPublication(boolean etat);
    List<Cours> listeTousLesCoursContenantLeTitre(String titre);

    Cours selectionnerUnCour(long id);

    Cours ajouterNouveauCour(Cours nouveauCours);
    Cours mettreAJourUnCour(Cours majCours);

    void supprimerUnCours(long id);
}
