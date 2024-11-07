package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Torneo;
import independiente_cef.proyectocef.Entidades.Usuario;
import independiente_cef.proyectocef.Servicios.Servicio_Torneo;
import independiente_cef.proyectocef.Servicios.Servicio_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173/")

@RestController
@RequestMapping("/Usuario")
public class Controlador_Usuario {

    @Autowired
    private Servicio_Usuario controlador_usuario;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Usuario meterdatos ) {
        Usuario guardardatos = controlador_usuario.agregar_usuarios(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Usuario>> listar(){
        List<Usuario> listausuario=controlador_usuario.mostrarusuarios();
        return new ResponseEntity<>(listausuario,HttpStatus.OK);
    }
    @GetMapping("/{documento}")
    public ResponseEntity<List<Usuario>> listarid(@RequestBody int documento){
        List<Usuario> listausuario=controlador_usuario.busquedausuarios(documento);
        return new ResponseEntity<>(listausuario,HttpStatus.OK);
    }
}
