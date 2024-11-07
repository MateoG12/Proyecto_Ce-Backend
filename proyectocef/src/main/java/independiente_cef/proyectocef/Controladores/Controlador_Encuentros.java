package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Encuentros;
import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Servicios.Servicio_Inscripcion;
import independiente_cef.proyectocef.Servicios.Servicios_Encuentros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/Encuentros")
public class Controlador_Encuentros {
    @Autowired
    private Servicios_Encuentros controlador_encuentros;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Encuentros meterdatos ) {
        Encuentros guardardatos = controlador_encuentros.agregar_encuentros(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Encuentros>> listar(){
        List<Encuentros> listaencuentros=controlador_encuentros.mostrarencuentros();
        return new ResponseEntity<>(listaencuentros,HttpStatus.OK);
    }
    @GetMapping("/detalles/{id}")
    public ResponseEntity<List<Encuentros>> listarid(@RequestBody int encuentroId){
        List<Encuentros> listaencuentros=controlador_encuentros.busquedaEncuentros(encuentroId);
        return new ResponseEntity<>(listaencuentros,HttpStatus.OK);
    }
}
