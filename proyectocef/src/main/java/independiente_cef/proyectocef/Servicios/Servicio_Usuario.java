package independiente_cef.proyectocef.Servicios;

import independiente_cef.proyectocef.Entidades.Encuentros;
import independiente_cef.proyectocef.Entidades.Usuario;
import independiente_cef.proyectocef.Repositorios.Repositorio_Encuentros;
import independiente_cef.proyectocef.Repositorios.Repositorio_Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Servicio_Usuario {
    @Autowired
    private Repositorio_Usuario datos_usuario;
    // nombre de la entidad
    public Usuario agregar_usuarios(Usuario agregar_datosE)
    {
        return  datos_usuario.save(agregar_datosE);
    }

    public List<Usuario> mostrarusuarios (){
        return datos_usuario.findAll();
    }
    // el mismo dato que se pone en el repositorio
    public List<Usuario> busquedausuarios (int documento ){
        return datos_usuario.Consulta_usuario(documento);
    }
}
