package com.exerciceSpring.exo.Model;


import jakarta.persistence.*;
import java.util.List;
@Entity
public class Niveau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getLibelniv() {
        return libelniv;
    }

    public void setLibelniv(String libelniv) {
        this.libelniv = libelniv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable = false)
    private String libelniv;

    public Niveau(Long id, String libelniv) {
        this.id = id;
        this.libelniv = libelniv;
    }
    @OneToMany(mappedBy = "niveau",cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;
    public Niveau(){}
}
