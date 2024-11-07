package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Equipo;
import independiente_cef.proyectocef.Entidades.Estadisticas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repositorio_Estadisticas extends JpaRepository<Estadisticas,String> {
    @Query("SELECT e FROM Estadisticas e WHERE e.id = :id")
    List<Estadisticas> Consulta_Estadisticas(int id) ;
}
