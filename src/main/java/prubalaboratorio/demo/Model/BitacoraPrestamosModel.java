package prubalaboratorio.demo.Model;

import lombok.Data;

@Data
public class BitacoraPrestamosModel {

    private int idSolicitante;
    private int idMaterial;
    private String fecha;
    private int idEstado;

    public BitacoraPrestamosModel(){

    }
}
