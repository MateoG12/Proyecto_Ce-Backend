package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Encuentros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repositorio_Encuentros extends JpaRepository<Encuentros,Integer> {
    @Query("SELECT e FROM Encuentros e WHERE e.encuentroId = :encuentroId")
    List<Encuentros> Consulta_Encuentros(int encuentroId) ;
}
