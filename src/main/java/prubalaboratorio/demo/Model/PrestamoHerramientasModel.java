package prubalaboratorio.demo.Model;

import lombok.Data;

import java.util.Date;

@Data
public class PrestamoHerramientasModel {
    private int idSolicitante;
    private int idHerramienta;
    private Date fecha;
    private int idEstado;

    public PrestamoHerramientasModel() {

    }
}