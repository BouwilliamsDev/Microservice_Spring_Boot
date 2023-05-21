package com.bouwilliams.microservicespringweb.repository;

import com.bouwilliams.microservicespringweb.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long> {

    List<Cours> findByEstPublie(boolean publie);
    List<Cours> findByTitreContaining(String titre);
}
