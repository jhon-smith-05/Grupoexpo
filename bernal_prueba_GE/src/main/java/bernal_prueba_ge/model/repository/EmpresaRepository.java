package bernal_prueba_ge.model.repository;

import bernal_prueba_ge.model.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

    @Query("SELECT e FROM Empresa e order by e.fecha desc LIMIT 3")
    List<Empresa> findTop3UltimosRegistros();

}
