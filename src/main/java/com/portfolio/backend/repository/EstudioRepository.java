package com.portfolio.backend.repository;

import com.portfolio.backend.model.Estudio;
import com.portfolio.backend.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepository extends JpaRepository<Estudio, Long> {
   
        List<Estudio> findAllByPersonaId(Long personaId);

}
