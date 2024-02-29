package com.groupeisi.dao;

import com.groupeisi.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    Etudiant findByEmail(String email);
}
