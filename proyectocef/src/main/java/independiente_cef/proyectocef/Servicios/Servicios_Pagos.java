package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Implementos;
import independiente_cef.proyectocef.Entidades.Pagos;
import independiente_cef.proyectocef.Repositorios.Repositorio_Implementos;
import independiente_cef.proyectocef.Repositorios.Repositorio_Pagos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicios_Pagos {

    @Autowired
    private Repositorio_Pagos datos_pagos;
    // nombre de la entidad
    public Pagos agregarpagos(Pagos agregar_datos)
    {
        return  datos_pagos.save(agregar_datos);
    }

    public List<Pagos> mostrarpagos (){
        return datos_pagos.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Pagos> busquedapagos (int pagosId ){
        return datos_pagos.Consulta_pagos(pagosId);
    }
}
