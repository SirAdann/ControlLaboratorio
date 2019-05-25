package prubalaboratorio.demo.Entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="periodo")
public class Periodo {

    @Id
    @Column(name="id_periodo")
    private int idPeriodo;
    @Column(name="tipo")
    private String tipo;
    @OneToOne
    @JoinColumn(name="id_duracion")
    private Duracion duracion;

    public Periodo() {
    }
}
