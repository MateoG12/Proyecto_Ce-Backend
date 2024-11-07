package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface Repositorio_Inscripcion extends JpaRepository<Inscripcion,Integer> {
//listado consultas
    //se usa para las consultas
@Query("SELECT e FROM Inscripcion e WHERE e.documento = :documento")
    List<Inscripcion> Consulta_documento(int documento) ;
}