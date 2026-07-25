package com.exerciceSpring.exo.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Annee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String annee;


    @OneToMany(mappedBy = "annee",cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    // Constructeur vide requis par JPA
    public Annee() {
    }

    public Annee(Long id, String annee) {
        this.id = id;
        this.annee = annee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

}