package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="prestamo_herramientas")
public class PrestamoHerramienta implements Serializable {
    @Id
    @Column(name="id_solicitante")
    private int idSolicitante;
    @Id
    @Column(name="id_equipo")
    private int idEquipo;
    @Column(name="fecha")
    private Date fecha;
    @OneToOne
    @JoinColumn(name="id_estado",nullable = false)
    private EstadoPrestamoHerramienta idEstado;


    public PrestamoHerramienta() {

    }
}
