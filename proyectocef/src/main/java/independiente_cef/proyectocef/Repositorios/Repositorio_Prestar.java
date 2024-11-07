package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Pagos;
import independiente_cef.proyectocef.Entidades.Prestar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repositorio_Prestar extends JpaRepository<Prestar,Integer> {
//listado consultas
    //se usa para las consultas
@Query("SELECT p FROM Prestar p WHERE p.cantidad = :cantidad")
    List<Prestar> Consulta_prestar(int cantidad) ;
}