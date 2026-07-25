package com.exerciceSpring.exo.Controller;

import com.exerciceSpring.exo.Model.Inscription;
import com.exerciceSpring.exo.Service.InscriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/inscriptions")
public class InscriptionController {
    private InscriptionService inscriptionService;

    public InscriptionController(InscriptionService newinscriptionService){
        this.inscriptionService = newinscriptionService;
    }

@GetMapping
   public List<Inscription> ListerInscription(){
        return inscriptionService.ListerInscription();
}
@PostMapping
   public Inscription AjouterInscription(@RequestBody Inscription newinscription){
        return inscriptionService.AjouterInscription(newinscription);
}

@PutMapping("/{id}")
    public Inscription UpdateInscription(@PathVariable Long id,@RequestBody Inscription inscription){
        return inscriptionService.update(id,inscription);
}
@DeleteMapping("/{id}")
    public void supprimerInscription(@PathVariable Long id){
        inscriptionService.SupprimerInscription(id);
}
}
