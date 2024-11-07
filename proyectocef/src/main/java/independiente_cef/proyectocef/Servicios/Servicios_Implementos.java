package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Implementos;
import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Repositorios.Repositorio_Implementos;
import independiente_cef.proyectocef.Repositorios.Repositorio_Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicios_Implementos {
    // ingresar datos
    @Autowired
    private Repositorio_Implementos datos_implementos;
    // nombre de la entidad
    public Implementos agregarimplementos(Implementos agregar_datos)
    {
        return  datos_implementos.save(agregar_datos);
    }

    public List<Implementos> mostrarimplementos (){
        return datos_implementos.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Implementos> busquedaimplementos (int implementosId ){
        return datos_implementos.Consulta_implementos(implementosId);
    }
}
