package com.exerciceSpring.exo.Model;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String libelform;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelform() {
        return libelform;
    }
    @OneToMany(mappedBy = "formation",cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    public void setLibelform(String libelform) {
        this.libelform = libelform;
    }
    public Formation(){}

    public Formation(Long id, String libelform) {
        this.id = id;
        this.libelform = libelform;
    }

}
