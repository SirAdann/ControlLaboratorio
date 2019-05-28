package prubalaboratorio.demo.Entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="duracion")
public class Duracion {

    @Id
    @Column(name="id_duracion")
    private int idDuracion;
    @Column(name="tipo_duracion")
    private String tipoDuracion;

    public Duracion() {
    }
}
