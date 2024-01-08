package bernal_prueba_ge.service.impl;

import bernal_prueba_ge.model.entities.Empresa;
import bernal_prueba_ge.model.repository.EmpresaRepository;
import bernal_prueba_ge.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    EmpresaRepository repository;

    @Override
    public Empresa registrar(Empresa empresa) {
        return repository.save(empresa);
    }

    @Override
    public List<Empresa> listar() {
        return (List<Empresa>) repository.findAll();
    }


    @Override
    public List<Empresa> obtenerTresUltimosRegistros() {
        return repository.findTop3UltimosRegistros();
    }


}
