package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Equipo;
import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Repositorios.Repositorio_Equipo;
import independiente_cef.proyectocef.Repositorios.Repositorio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Equipo {
    // ingresar datos
    @Autowired
    private Repositorio_Equipo datos_equipo;
    // nombre de la entidad
    public Equipo agregar(Equipo agregar_datosEQ)
    {
        return datos_equipo.save(agregar_datosEQ);
    }

    public List<Equipo> mostrarequipos (){
        return datos_equipo.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Equipo> busquedaequipo (int equipoid ){
        return datos_equipo.Consulta_Equipo(equipoid);
    }
}
