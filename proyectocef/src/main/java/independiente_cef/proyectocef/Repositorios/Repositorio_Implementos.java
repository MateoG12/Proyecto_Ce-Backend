package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Implementos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio_Implementos extends JpaRepository<Implementos, Integer> {

    // Aquí debes asegurarte de usar el nombre del atributo que realmente existe en la entidad 'Implementos'
    @Query("SELECT i FROM Implementos i WHERE i.implementosId = :implementosId")
    List<Implementos> Consulta_implementos(int implementosId);
}