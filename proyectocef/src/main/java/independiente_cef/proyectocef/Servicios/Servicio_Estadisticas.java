package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Estadisticas;
import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Repositorios.Repositorio_Estadisticas;
import independiente_cef.proyectocef.Repositorios.Repositorio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio_Estadisticas {

    // ingresar datos
    @Autowired
    private Repositorio_Estadisticas datos_estadisticas;
    // nombre de la entidad
    public Estadisticas agregarestadistica(Estadisticas agregar_datos)
    {
        return  datos_estadisticas.save(agregar_datos);
    }

    public List<Estadisticas> mostrarestadisticas (){
        return datos_estadisticas.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Estadisticas> busquedaestadisticas (int id ){
        return datos_estadisticas.Consulta_Estadisticas(id);
    }
}
