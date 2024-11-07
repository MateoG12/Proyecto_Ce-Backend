package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Encuentros;
import independiente_cef.proyectocef.Repositorios.Repositorio_Encuentros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servicios_Encuentros {

    @Autowired
    private Repositorio_Encuentros datos_encuentros;
    // nombre de la entidad
    public Encuentros agregar_encuentros(Encuentros agregar_datosE)
    {
        return  datos_encuentros.save(agregar_datosE);
    }

    public List<Encuentros> mostrarencuentros (){
        return datos_encuentros.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Encuentros> busquedaEncuentros (int encuentroId ){
        return datos_encuentros.Consulta_Encuentros(encuentroId);
    }
}
