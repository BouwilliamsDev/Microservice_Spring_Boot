package com.bouwilliams.microservicespringweb.service;

import com.bouwilliams.microservicespringweb.model.Cours;

import java.util.List;

public interface CoursService {

    List<Cours> selectionnerTousLesCours();
    List<Cours> selectinnerTousLesCoursParPublication(boolean etat);
    List<Cours> selectionnerTousLesCoursContenantLeTitre(String titre);
    Cours selectionnerUnCour(long id);
    Cours ajouterUnNouveauCour(Cours nouveauCours);
    Cours mettreAJourUnCour(Cours majCours);
    void supprimerUnCour(long id);
}
