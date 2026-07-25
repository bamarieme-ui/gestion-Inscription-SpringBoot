package com.exerciceSpring.exo.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "etudiant",cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Etudiant(){

    }

    public Etudiant(Long id, String code, String prenom, String nom, String email) {
        this.id = id;
        this.code = code;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
    }



}
