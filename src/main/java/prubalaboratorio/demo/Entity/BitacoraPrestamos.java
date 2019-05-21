package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="bitacora_prestamos")
public class BitacoraPrestamos implements Serializable {
    @Id
    @Column(name="id_solicitante")
    private int idSolicitante;
    @Id
    @Column(name="id_material")
    private int idMaterial;
    @Column(name="fecha")
    private Date fecha;
    @OneToOne
    @JoinColumn(name="id_estado",nullable = false)
    private EstadoPrestamos idEstado;


    public BitacoraPrestamos() {

    }
}
