package com.portfolio.backend.repository;

import com.portfolio.backend.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEstudio extends JpaRepository<Estudio, Long> {
    
}
