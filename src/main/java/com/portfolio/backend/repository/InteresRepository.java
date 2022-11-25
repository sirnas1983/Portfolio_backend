package com.portfolio.backend.repository;

import com.portfolio.backend.model.Interes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteresRepository extends JpaRepository<Interes, Long>{
    
    List<Interes> findAllByPersonaId(Long personaId);
    
}
