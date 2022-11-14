
package com.portfolio.backend.controller;
import com.portfolio.backend.model.Estudio;
import com.portfolio.backend.service.EstudioService;
import com.portfolio.backend.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudioController {
    
    @Autowired
    private EstudioService estudioSer;
    @Autowired
    private PersonaService personaSer;
    
    @GetMapping("/ver/estudios")
    @ResponseBody
    public List<Estudio> verEstudios(){
        System.out.println(estudioSer.verEstudios().toString());
        return estudioSer.verEstudios();
    }
    
    @GetMapping("/ver/estudito")
    @ResponseBody
    public String verEstudito(){
        return estudioSer.verEstudios().toString();
    }
    
    @PostMapping("/borrar/estudio/{id}")
    public void borrarEstudio(@PathVariable Long id){
        estudioSer.borrarEstudio(id);
    }
    
    @PostMapping("/modificar/estudio/{id}")
    public void modificarEstudio(@PathVariable Long id, @RequestBody Estudio estudio){
        estudio.setId(id);
        estudioSer.agregarEstudio(estudio);
    }
    
    @PostMapping("/agregar/estudio")
    public void agregarEstudio(@RequestBody Estudio estudio){
        estudioSer.agregarEstudio(estudio);
    }
    
    @GetMapping("/persona/{idPersona}/ver/estudios")
    public List<Estudio> verEstudiosPorPersona(@PathVariable Long idPersona){
        return estudioSer.verEstudiosPorPersonaId(idPersona);
    }
       
}
