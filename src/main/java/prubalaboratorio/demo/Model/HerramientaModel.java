package prubalaboratorio.demo.Model;

import lombok.Data;
import prubalaboratorio.demo.Entity.Solicitante;
import prubalaboratorio.demo.Entity.TipoHerramienta;

import java.util.Set;

@Data
public class HerramientaModel {
    private int id;
    private String marca;
    private Double costo;
    private int cantidad;
    private String modelo;
    private TipoHerramienta tipoHerramienta;
    private int tipoUso;
    private Set<Solicitante> solicitante;

}
