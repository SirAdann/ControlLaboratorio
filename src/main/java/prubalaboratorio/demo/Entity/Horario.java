package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name="horarios")
public class Horario {

    @Id
    @Column(name="id_horario")
    private int idHorario;
    @Column(name="hora_inicio")
    private Date horaInicio;
    @Column(name="hora_final")
    private Date horaFinal;
    @OneToOne
    @JoinColumn(name="id_periodo")
    private Periodo idPeriodo;
    @OneToOne
    @JoinColumn(name="laboratorio")
    private Laboratorio laboratorio;

    @ManyToMany(mappedBy = "horarios")
    private Set<Solicitante> solicitantes_horarios;

    public Horario() {
    }
}
