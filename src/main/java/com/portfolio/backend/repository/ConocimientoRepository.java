package com.portfolio.backend.repository;

import com.portfolio.backend.model.Conocimiento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConocimientoRepository extends JpaRepository<Conocimiento, Long> {

    List<Conocimiento> findAllByPersonaId(Long personaId);
    
}
