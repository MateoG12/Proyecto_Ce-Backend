package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Encuentros;
import independiente_cef.proyectocef.Entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repositorio_Equipo extends JpaRepository<Equipo,String> {
    @Query("SELECT e FROM Equipo e WHERE e.equipoid = :equipoid")
    List<Equipo> Consulta_Equipo(int equipoid) ;
}
