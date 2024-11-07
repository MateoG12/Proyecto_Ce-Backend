package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Torneo;
import independiente_cef.proyectocef.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repositorio_Usuario extends JpaRepository<Usuario,String> {
//listado consultas
    //se usa para las consultas
@Query("SELECT u FROM Usuario u WHERE u.documento = :documento")
    List<Usuario> Consulta_usuario(int documento) ;
}