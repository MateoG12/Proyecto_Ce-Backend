package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Repositorios.Repositorio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicio_Inscripcion {
    // ingresar datos
    @Autowired
    private Repositorio_Inscripcion datos_inscripcion;
    // nombre de la entidad
    public Inscripcion agregar(Inscripcion agregar_datos)
    {
        return  datos_inscripcion.save(agregar_datos);
    }

    public List<Inscripcion> mostrarinscripciones (){
        return datos_inscripcion.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Inscripcion> busquedainscripcion (int documento ){
        return datos_inscripcion.Consulta_documento(documento);
    }

}