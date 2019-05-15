package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
    @Column(name="id_estado")
    private int idEstado;


    public BitacoraPrestamos(int idSolicitante, int idMaterial, Date fecha, int idEstado) {
        this.idSolicitante = idSolicitante;
        this.idMaterial = idMaterial;
        this.fecha = fecha;
        this.idEstado = idEstado;
    }
}
