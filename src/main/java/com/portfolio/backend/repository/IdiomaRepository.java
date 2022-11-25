
package com.portfolio.backend.repository;

import com.portfolio.backend.model.Idioma;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Long> {

    List<Idioma> findAllByPersonaId(Long personaId);    
}
