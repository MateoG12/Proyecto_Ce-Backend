package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Equipo;
import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Servicios.Servicio_Equipo;
import independiente_cef.proyectocef.Servicios.Servicio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/Equipo")
public class Controlador_Equipo {
    @Autowired
    private Servicio_Equipo controlador_equipo;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Equipo meterdatos ) {
        Equipo guardardatos = controlador_equipo.agregar(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Equipo>> listar(){
        List<Equipo> listaequipos=controlador_equipo.mostrarequipos();
        return new ResponseEntity<>(listaequipos,HttpStatus.OK);
    }
    @GetMapping("/{equipoId}")
    public ResponseEntity<List<Equipo>> listarid(@RequestBody int equipoid){
        List<Equipo> listaequipos=controlador_equipo.busquedaequipo(equipoid);
        return new ResponseEntity<>(listaequipos,HttpStatus.OK);
    }
}
