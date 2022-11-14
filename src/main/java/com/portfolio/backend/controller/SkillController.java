package com.portfolio.backend.controller;

import com.portfolio.backend.model.Skill;
import com.portfolio.backend.service.SkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    
    @Autowired
    private SkillService skillSer;
    
    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skill> verSkills(){
        return skillSer.verSkills();
    }
    
    @GetMapping("/ver/skill/{id}")
    @ResponseBody
    public Skill verSkill(@PathVariable Long id){
        return skillSer.verSkill(id);
    }
    
    @PostMapping("/borrar/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillSer.borrarSkill(id);
    }
    
    @PostMapping("/modificar/skill/{id}")
    public void modificarSkill(@PathVariable Long id, @RequestBody Skill skill){
        skill.setId(id);
        skillSer.agregarSkill(skill);
    }
    
    @PostMapping("/agregar/skill")
    public void agregarSkill(@RequestBody Skill skill){
        skillSer.agregarSkill(skill);
    }        
    
}
