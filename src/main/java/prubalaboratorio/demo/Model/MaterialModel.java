package prubalaboratorio.demo.Model;

import lombok.Data;
import prubalaboratorio.demo.Entity.Solicitante;

import java.util.Set;

@Data
public class MaterialModel {


    private int idMaterial;
    private String marca;
    private Double costo;
    private int cantidad;
    private String modelo;
    private String tipoMaterial;
    private int ram;
    private String procesador;
    private int capacidad;
    private String sOperativo;
    private int tipoUso;
    private int estadoMaterial;
    private Set<Solicitante> solicitante;

    public MaterialModel(){

    }
}
