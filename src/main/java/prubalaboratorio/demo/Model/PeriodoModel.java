package prubalaboratorio.demo.Model;

import lombok.Data;
import prubalaboratorio.demo.Entity.Duracion;

@Data
public class PeriodoModel {

    private int idPeriodo;
    private String tipo;
    private Duracion duracion;

    public PeriodoModel() {
    }
}
