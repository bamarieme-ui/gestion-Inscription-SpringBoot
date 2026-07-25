package com.exerciceSpring.exo.Repository;

import com.exerciceSpring.exo.Model.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
    List<Inscription> findByEtudiantId(Long etudiantId);
    List<Inscription> findByFormationId(Long formationId);

    List<Inscription> findByNiveauIdAndAnneeId(
            Long niveauId,
            Long anneeId

    );
}
