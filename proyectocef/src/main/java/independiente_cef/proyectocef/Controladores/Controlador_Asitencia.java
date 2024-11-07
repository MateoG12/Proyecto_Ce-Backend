package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Asistencia;
import independiente_cef.proyectocef.Servicios.Servicio_Asistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/asistencia")
public class Controlador_Asitencia {
    @Autowired
    private Servicio_Asistencia controlador_Asistencia;

    @PostMapping
    public ResponseEntity datos_asistencia (@RequestBody Asistencia meterdatos_asistencia ) {
        Asistencia guardardatos = controlador_Asistencia.agregar_asistencia(meterdatos_asistencia);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Asistencia>> listarAsistencia(){
        List<Asistencia> listaasistencia=controlador_Asistencia.mostrarAsistencias();
        return new ResponseEntity<>(listaasistencia,HttpStatus.OK);
    }
    @GetMapping("/buscar")
    public ResponseEntity<List<Asistencia>> listarid(@RequestBody int documento){
        List<Asistencia> listaasistencia=controlador_Asistencia.busquedaAsistencia(documento);
        return new ResponseEntity<>(listaasistencia,HttpStatus.OK);
    }
}
