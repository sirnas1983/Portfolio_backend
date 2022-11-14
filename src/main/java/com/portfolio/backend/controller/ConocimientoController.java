package com.portfolio.backend.controller;

import com.portfolio.backend.model.Conocimiento;
import com.portfolio.backend.service.ConocimientoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConocimientoController {
    
    @Autowired
    private ConocimientoService conocimientoSer;
    
    @GetMapping("/ver/conocimientos")
    @ResponseBody
    public List<Conocimiento> verConocimientos(){
        return conocimientoSer.verConocimientos();
    }
    
    @GetMapping("/ver/conocimiento/{id}")
    @ResponseBody
    public Conocimiento verConocimiento(@PathVariable Long id){
        return conocimientoSer.verConocimiento(id);
    }
    
    @PostMapping("/borrar/conocimiento/{id}")
    public void borrarConocimiento(@PathVariable Long id){
        conocimientoSer.borrarConocimiento(id);
    }
    
    @PostMapping("/modificar/conocimiento/{id}")
    public void modificarConocimiento(@PathVariable Long id, @RequestBody Conocimiento conocimiento){
        conocimiento.setId(id);
        conocimientoSer.agregarConocimiento(conocimiento);
    }
    
    @PostMapping("/agregar/conocimiento")
    public void agregarConocimiento(@RequestBody Conocimiento conocimiento){
        conocimientoSer.agregarConocimiento(conocimiento);
    }
    
}
