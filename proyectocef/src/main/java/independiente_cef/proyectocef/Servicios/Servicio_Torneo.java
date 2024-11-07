package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Encuentros;
import independiente_cef.proyectocef.Entidades.Torneo;
import independiente_cef.proyectocef.Repositorios.Repositorio_Encuentros;
import independiente_cef.proyectocef.Repositorios.Repositorio_Torneo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Torneo {
    @Autowired
    private Repositorio_Torneo datos_torneo;
    // nombre de la entidad
    public Torneo agregar_torneo(Torneo agregar_datosE)
    {
        return  datos_torneo.save(agregar_datosE);
    }

    public List<Torneo> mostrartorneo (){
        return datos_torneo.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Torneo> busquedatorneo (int torneoId ){
        return datos_torneo.Consulta_torneo(torneoId);
    }
}
