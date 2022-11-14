package com.portfolio.backend.service;


import com.portfolio.backend.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> verSkills();
    public Skill verSkill(Long id);
    public void borrarSkill(Long id);
    public void agregarSkill(Skill skill);
    public void modificarSkill(Long id, Skill skill);
}
