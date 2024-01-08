package bernal_prueba_ge.model.repository;

import bernal_prueba_ge.model.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

    //List<Empresa> getTopByFecha_DateOrderByFechaDesc();

    @Query("SELECT e FROM Empresa e order by e.fecha ASC LIMIT 3")
    List<Empresa> findTop3UltimosRegistros();

}
