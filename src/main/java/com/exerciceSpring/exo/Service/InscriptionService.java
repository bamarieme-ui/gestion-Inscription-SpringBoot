package com.exerciceSpring.exo.Service;

import com.exerciceSpring.exo.Model.Inscription;
import com.exerciceSpring.exo.Repository.InscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscriptionService {
    private InscriptionRepository inscriptionRepository;

    public InscriptionService(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }
    public List<Inscription> ListerInscription(){
        return inscriptionRepository.findAll();
    }
    public Inscription AjouterInscription(Inscription newInscription){
        return inscriptionRepository.save(newInscription);
    }

    public Inscription RechercherInscription(Long id) {
        return inscriptionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inscription introuvable"));
    }

    public Inscription update(Long id,Inscription inscription){
        Inscription i =  RechercherInscription(id);
        i.setEtudiant(inscription.getEtudiant());
        i.setFormation(inscription.getFormation());
        i.setNiveau(inscription.getNiveau());
        i.setAnnee(inscription.getAnnee());
        i.setDate(inscription.getDate());

        return inscriptionRepository.save(i);
    }


    public void SupprimerInscription(Long id){
        inscriptionRepository.deleteById(id);
    }


 }

