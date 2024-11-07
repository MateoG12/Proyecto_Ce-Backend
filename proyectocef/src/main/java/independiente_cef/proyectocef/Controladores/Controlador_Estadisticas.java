package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Estadisticas;
import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Servicios.Servicio_Estadisticas;
import independiente_cef.proyectocef.Servicios.Servicio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/Estadisticas")
public class Controlador_Estadisticas {
    @Autowired
    private Servicio_Estadisticas controlador_estadisticas;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Estadisticas meterdatos ) {
        Estadisticas guardardatos = controlador_estadisticas.agregarestadistica(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Estadisticas>> listar(){
        List<Estadisticas> listaestadisticas=controlador_estadisticas.mostrarestadisticas();
        return new ResponseEntity<>(listaestadisticas,HttpStatus.OK);
    }
    @GetMapping("/{estadisticaId}")
    public ResponseEntity<List<Estadisticas>> listarid(@RequestBody int id){
        List<Estadisticas> listaestadisticas=controlador_estadisticas.busquedaestadisticas(id);
        return new ResponseEntity<>(listaestadisticas,HttpStatus.OK);
    }
}
