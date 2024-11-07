package independiente_cef.proyectocef.Repositorios;

import independiente_cef.proyectocef.Entidades.Inscripcion;
import independiente_cef.proyectocef.Entidades.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Repositorio_Pagos extends JpaRepository<Pagos,Integer> {
//listado consultas
    //se usa para las consultas
@Query("SELECT e FROM Pagos e WHERE e.pagosId = :pagosId")
    List<Pagos> Consulta_pagos(int pagosId) ;
}