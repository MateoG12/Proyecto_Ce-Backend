package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Prestar;
import independiente_cef.proyectocef.Entidades.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repositorio_Torneo extends JpaRepository<Torneo,String> {
//listado consultas
    //se usa para las consultas
@Query("SELECT t FROM Torneo t WHERE t.torneoId = :torneoId")
    List<Torneo> Consulta_torneo(int torneoId) ;
}