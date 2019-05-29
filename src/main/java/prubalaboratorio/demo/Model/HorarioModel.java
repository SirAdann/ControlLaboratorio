package prubalaboratorio.demo.Model;

import lombok.Data;

import java.util.Date;

@Data
public class HorarioModel {

    private int idHorario;
    private Date horaInicio;
    private Date horaFinal;
    private int idPeriodo;
    private String laboratorio;

    public HorarioModel() {
    }
}
