package com.bouwilliams.microservicespringweb.model;

import javax.persistence.*;

@Entity
@Table(name = "cours_tb")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "titre", length = 100)
    private String titre;

    @Column(name = "presentation", length = 255)
    private String description;
    @Column(name = "publie")
    private boolean estPublie;

    public Cours() {
    }

    public Cours(String titre, String description, boolean estPublie) {
        this.titre = titre;
        this.description = description;
        this.estPublie = estPublie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEstPublie() {
        return estPublie;
    }

    public void setEstPublie(boolean estPublie) {
        this.estPublie = estPublie;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", estPublie=" + estPublie +
                '}';
    }
}
