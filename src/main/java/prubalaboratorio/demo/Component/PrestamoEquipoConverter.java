package prubalaboratorio.demo.Component;

import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.PrestamoEquipo;
import prubalaboratorio.demo.Model.PrestamoEquipoModel;

@Component("prestamoEquipoConverter")
public class PrestamoEquipoConverter {

public PrestamoEquipo convertirPrestamoEquipoModelaPrestamoEquipo(PrestamoEquipoModel prestamoEquipoModel){
    PrestamoEquipo prestamoEquipo= new PrestamoEquipo();

    prestamoEquipo.setIdEquipo(prestamoEquipoModel.getIdEquipo());
    prestamoEquipo.setIdSolicitante(prestamoEquipoModel.getIdSolicitante());
    prestamoEquipo.setFecha(prestamoEquipo.getFecha());
    //buscar catalogo de estado
    //prestamoEquipo.setIdEstado();

    return prestamoEquipo;
}

}
