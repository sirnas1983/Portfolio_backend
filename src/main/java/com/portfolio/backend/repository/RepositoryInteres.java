package com.portfolio.backend.repository;

import com.portfolio.backend.model.Interes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryInteres extends JpaRepository<Interes, Long>{
    
}
