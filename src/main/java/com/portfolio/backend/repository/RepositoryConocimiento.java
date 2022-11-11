package com.portfolio.backend.repository;

import com.portfolio.backend.model.Conocimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryConocimiento extends JpaRepository<Conocimiento, Long> {
    
}
