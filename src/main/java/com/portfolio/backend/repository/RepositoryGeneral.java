package com.portfolio.backend.repository;

import com.portfolio.backend.model.DatosGenerales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGeneral extends JpaRepository<DatosGenerales, Long> {
    
}
