package bernal_prueba_ge.service;

import bernal_prueba_ge.model.entities.Empresa;

import java.util.List;

public interface EmpresaService {

    public Empresa registrar(Empresa empresa);

    public List<Empresa> listar();

   public List<Empresa> obtenerTresUltimosRegistros();


}
