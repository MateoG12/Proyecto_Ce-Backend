package independiente_cef.proyectocef.Controladores;

import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Entidades.Pagos;
import independiente_cef.proyectocef.Servicios.Servicio_Inscripcion;
import independiente_cef.proyectocef.Servicios.Servicios_Pagos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "")
// aqui va la ruta del vue matein

@RestController

@RequestMapping("/Pagos")
public class Controlador_Pagos {
    @Autowired
    private Servicios_Pagos controlador_pagos;

    @PostMapping
    public ResponseEntity daticos (@RequestBody Pagos meterdatos ) {
        Pagos guardardatos = controlador_pagos.agregarpagos(meterdatos);
        return new ResponseEntity<> (guardardatos, HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<List<Pagos>> listar(){
        List<Pagos> listapagos=controlador_pagos.mostrarpagos();
        return new ResponseEntity<>(listapagos,HttpStatus.OK);
    }
    @GetMapping("/{pagosId}")
    public ResponseEntity<List<Pagos>> listarid(@RequestBody int pagosId){
        List<Pagos> listapagos=controlador_pagos.busquedapagos(pagosId);
        return new ResponseEntity<>(listapagos,HttpStatus.OK);
    }
}
