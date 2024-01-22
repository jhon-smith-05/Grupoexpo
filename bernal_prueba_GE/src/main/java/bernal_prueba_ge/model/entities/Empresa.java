package bernal_prueba_ge.model.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empresa")
    private int idEmpresa;
    @Column(name = "ruc")
    private String ruc;
    @Column(name = "razon_Social")
    private String razonSocial;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fecha")
    private Date fecha;

    public Empresa() {
    }

    public Empresa(int idEmpresa, String ruc, String razonSocial, String direccion, String estado, Date fecha) {
        this.idEmpresa = idEmpresa;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
