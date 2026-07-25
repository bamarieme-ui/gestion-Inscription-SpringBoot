package com.exerciceSpring.exo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;



@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private Date date;


    @ManyToOne
    @JoinColumn(name="etudiant_id")
    @JsonIgnoreProperties("inscriptions")
    private Etudiant etudiant;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Annee getAnnee() {
        return annee;
    }

    public void setAnnee(Annee annee) {
        this.annee = annee;
    }

    @ManyToOne
    @JoinColumn(name="formation_id")
    @JsonIgnoreProperties("inscriptions")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name="niveau_id")
    @JsonIgnoreProperties("inscriptions")
    private Niveau niveau;

    @ManyToOne
    @JoinColumn(name="annee_id")
    @JsonIgnoreProperties("inscriptions")
    private Annee annee;

    public Inscription(){}



}
