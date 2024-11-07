package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Pagos;
import independiente_cef.proyectocef.Entidades.Prestar;
import independiente_cef.proyectocef.Servicios.Servicios_Pagos;
import independiente_cef.proyectocef.Servicios.Servicios_Prestar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/Prestar")
public class Controlador_Prestar {
    @Autowired
    private Servicios_Prestar controlador_prestar;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Prestar meterdatos ) {
        Prestar guardardatos = controlador_prestar.agregarprestamos(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Prestar>> listar(){
        List<Prestar> listaprestar=controlador_prestar.mostrarprestamos();
        return new ResponseEntity<>(listaprestar,HttpStatus.OK);
    }
    @GetMapping("/{cantidad}")

    public ResponseEntity<List<Prestar>> listarid(@RequestBody int cantidad){
        List<Prestar> listaprestar=controlador_prestar.busquedaprestamos(cantidad);
        return new ResponseEntity<>(listaprestar,HttpStatus.OK);
    }
}
