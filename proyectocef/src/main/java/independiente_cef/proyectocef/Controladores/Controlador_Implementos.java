package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Estadisticas;
import independiente_cef.proyectocef.Entidades.Implementos;
import independiente_cef.proyectocef.Servicios.Servicio_Estadisticas;
import independiente_cef.proyectocef.Servicios.Servicios_Implementos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/Implementos")
public class Controlador_Implementos {
    @Autowired
    private Servicios_Implementos controlador_implementos;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Implementos meterdatos ) {
        Implementos guardardatos = controlador_implementos.agregarimplementos(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Implementos>> listar(){
        List<Implementos> listaimplementos=controlador_implementos.mostrarimplementos();
        return new ResponseEntity<>(listaimplementos,HttpStatus.OK);
    }
    @GetMapping("/{implementosId}")
    public ResponseEntity<List<Implementos>> listarid(@RequestBody int implementosId){
        List<Implementos> listaimplementos=controlador_implementos.busquedaimplementos(implementosId);
        return new ResponseEntity<>(listaimplementos,HttpStatus.OK);
    }
}
