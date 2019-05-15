package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="materiales")
public class Material {
    @Id
    @Column(name="id_material")
    private int idMaterial;
    @Column(name="marca",nullable = false)
    private String marca;
    @Column(name="costo",nullable = false)
    private Double costo;
    @Column(name="cantidad",nullable = false)
    private int cantidad;
    @Column(name="modelo",nullable = false)
    private String modelo;
    @OneToOne
    @JoinColumn(name="id_tipoMaterial",nullable = false)
    private TipoMaterial tipoMaterial;
    @Column(name="ram")
    private int ram;
    @Column(name="procesador")
    private String procesador;
    @Column(name="capacidad")
    private int capacidad;
    @Column(name="SOperativo")
    private String sOperativo;
    @Column(name="tipo_Uso",nullable = false)
    private int tipoUso;
    @Column(name="estado_material",nullable = false)
    private int estadoMaterial;

    @ManyToMany(mappedBy = "materiales")
    private Set<Solicitante> solicitante;

    public Material(int idMaterial, String marca, Double costo, int cantidad, String modelo, TipoMaterial tipoMaterial, int ram, String procesador, int capacidad, String sOperativo, int tipoUso, int estadoMaterial, Set solicitanteSet) {
        this.idMaterial = idMaterial;
        this.marca = marca;
        this.costo = costo;
        this.cantidad = cantidad;
        this.modelo = modelo;
        this.tipoMaterial = tipoMaterial;
        this.ram = ram;
        this.procesador = procesador;
        this.capacidad = capacidad;
        this.sOperativo = sOperativo;
        this.tipoUso = tipoUso;
        this.estadoMaterial = estadoMaterial;
        this.solicitante = solicitante;
    }
}
