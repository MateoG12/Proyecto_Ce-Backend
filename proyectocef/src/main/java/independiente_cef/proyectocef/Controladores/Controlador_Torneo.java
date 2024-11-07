package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Prestar;
import independiente_cef.proyectocef.Entidades.Torneo;
import independiente_cef.proyectocef.Servicios.Servicio_Torneo;
import independiente_cef.proyectocef.Servicios.Servicios_Prestar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/Torneo")
public class Controlador_Torneo {
    @Autowired
    private Servicio_Torneo controlador_torneo;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Torneo meterdatos ) {
        Torneo guardardatos = controlador_torneo.agregar_torneo(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Torneo>> listar(){
        List<Torneo> listatorneo=controlador_torneo.mostrartorneo();
        return new ResponseEntity<>(listatorneo,HttpStatus.OK);
    }
    @GetMapping("/{torneoId}")
    public ResponseEntity<List<Torneo>> listarid(@RequestBody int torneoId){
        List<Torneo> listatorneo=controlador_torneo.busquedatorneo(torneoId);
        return new ResponseEntity<>(listatorneo,HttpStatus.OK);
    }
}
