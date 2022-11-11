package com.portfolio.backend.repository;

import com.portfolio.backend.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySkill extends JpaRepository<Skill, Long>{
    
}
