package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="solicitante")
public class Solicitante {
    @Id
    @Column(name="id_solicitante")
    private int IdSolicitante;
    @Column(name="nombres")
    private String nombres;
    @Column(name="apellidos")
    private String apellidos;
    @Column(name="carrera")
    private String carrera;
    @Column(name="semestre")
    private String semestre;
    @Column(name="estado")
    private int estado;
    @OneToOne
    @JoinColumn(name="id_TipoSolicitante")
    private TipoSolicitante idTipoSolicitante;

    @ManyToMany
    @JoinTable (name = "bitacora_prestamos",
            joinColumns = @JoinColumn(name = "id_solicitante"),
            inverseJoinColumns = @JoinColumn(name = "id_material"))
    private Set<Material> materiales;

    public Solicitante(int idSolicitante, String nombres, String apellidos, String carrera, String semestre, int estado, TipoSolicitante idTipoSolicitante, Set materialesSet) {
        IdSolicitante = idSolicitante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.estado = estado;
        this.idTipoSolicitante = idTipoSolicitante;
        this.materiales = materiales;
    }
}
