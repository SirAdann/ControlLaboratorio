package prubalaboratorio.demo.Model;

import lombok.Data;

@Data
public class LaboratorioModel {

    private String laboratorio;
    private int capacidad;
    private int equipos;

    public LaboratorioModel() {
    }
}

