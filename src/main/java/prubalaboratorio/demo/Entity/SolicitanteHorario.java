package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="solicitantes_horarios")
public class SolicitanteHorario implements Serializable {
    @Id
    @Column(name="id_solicitante")
    private int idSolicitante;
    @Id
    @Column(name="id_horario")
    private int idHorario;
    @Column(name="Materia")
    private int materia;

    public SolicitanteHorario() {
    }
}
