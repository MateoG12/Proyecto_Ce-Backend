package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio_Asistencia extends JpaRepository<Asistencia, Integer> {
    @Query("SELECT a FROM Asistencia a WHERE a.documento = :consulta_documento_asis")
    List<Asistencia> Consulta_asistencia(int consulta_documento_asis);
}