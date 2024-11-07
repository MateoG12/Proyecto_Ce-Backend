package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Asistencia;
import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Repositorios.Repositorio_Asistencia;
import independiente_cef.proyectocef.Repositorios.Repositorio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Asistencia {
    @Autowired
    private Repositorio_Asistencia datos_Asistencia;
    // nombre de la entidad
    public Asistencia agregar_asistencia(Asistencia agregar_datos_asistencia)
    {
        return  datos_Asistencia.save(agregar_datos_asistencia);
    }

    public List<Asistencia> mostrarAsistencias (){
        return datos_Asistencia.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Asistencia> busquedaAsistencia (int documento ){
        return datos_Asistencia.Consulta_asistencia(documento);
    }
}
