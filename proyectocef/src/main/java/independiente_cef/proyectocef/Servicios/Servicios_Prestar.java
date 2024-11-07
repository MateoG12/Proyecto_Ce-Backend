package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Pagos;
import independiente_cef.proyectocef.Entidades.Prestar;
import independiente_cef.proyectocef.Repositorios.Repositorio_Pagos;
import independiente_cef.proyectocef.Repositorios.Repositorio_Prestar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicios_Prestar {
    @Autowired
    private Repositorio_Prestar datos_prestar;
    // nombre de la entidad
    public Prestar agregarprestamos(Prestar agregar_datos)
    {
        return  datos_prestar.save(agregar_datos);
    }

    public List<Prestar> mostrarprestamos (){
        return datos_prestar.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Prestar> busquedaprestamos (int cantidad ){
        return datos_prestar.Consulta_prestar(cantidad);
    }
}
