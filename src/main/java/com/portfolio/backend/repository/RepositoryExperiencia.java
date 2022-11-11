package com.portfolio.backend.repository;

import com.portfolio.backend.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExperiencia extends JpaRepository<Experiencia, Long> {
    
}
