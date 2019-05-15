package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tipo_material")
public class TipoMaterial {
    @Id
    @Column(name="id_tipoMaterial")
    private int idTipoMaterial;
    @Column(name="tipo_material")
    private String tipoMaterial;

    public TipoMaterial(int idTipoMaterial, String tipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
        this.tipoMaterial = tipoMaterial;
    }
}
