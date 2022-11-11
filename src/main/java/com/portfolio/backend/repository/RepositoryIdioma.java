
package com.portfolio.backend.repository;

import com.portfolio.backend.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryIdioma extends JpaRepository<Idioma, Long> {
    
}
