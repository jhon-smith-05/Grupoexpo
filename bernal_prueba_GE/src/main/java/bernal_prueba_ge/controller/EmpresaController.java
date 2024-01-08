package bernal_prueba_ge.controller;

import bernal_prueba_ge.model.entities.Empresa;
import bernal_prueba_ge.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @PostMapping("/empresa")
    public Empresa guardar(@RequestBody Empresa empresa){
        return service.registrar(empresa);
    }

    @GetMapping("/empresas")
    public List<Empresa> lista() {
        return service.listar();
    }

    @GetMapping("/empresas3")
    public List<Empresa> listaTresUltimasEmpresas() {
        return service.obtenerTresUltimosRegistros();
    }



}
