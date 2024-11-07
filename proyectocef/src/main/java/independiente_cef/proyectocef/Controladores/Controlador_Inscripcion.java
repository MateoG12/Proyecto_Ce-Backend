package independiente_cef.proyectocef.Controladores;


import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Servicios.Servicio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/inscripcion")
public class Controlador_Inscripcion {

    @Autowired
    private Servicio_Inscripcion controlador_inscripcion;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Inscripcion meterdatos ) {
        Inscripcion guardardatos = controlador_inscripcion.agregar(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Inscripcion>> listar(){
        List<Inscripcion> listainscripcion=controlador_inscripcion.mostrarinscripciones();
        return new ResponseEntity<>(listainscripcion,HttpStatus.OK);
    }
    @GetMapping("/{documento}")
    public ResponseEntity<List<Inscripcion>> listarid(@RequestBody int documento){
        List<Inscripcion> listainscripcion=controlador_inscripcion.busquedainscripcion(documento);
        return new ResponseEntity<>(listainscripcion,HttpStatus.OK);
    }

}