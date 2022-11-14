
package com.portfolio.backend.service;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{

    @Autowired
    private SkillRepository skillRepo;
    
    @Override
    public List<Skill> verSkills() {
        return skillRepo.findAll();
    }

    @Override
    public Skill verSkill(Long id) {
        return skillRepo.findById(id).orElse(new Skill());
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public void agregarSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void modificarSkill(Long id, Skill skill) {
        skill.setId(id);
        skillRepo.save(skill);
    }
    
}
