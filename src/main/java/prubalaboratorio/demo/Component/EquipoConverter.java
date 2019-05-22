package prubalaboratorio.demo.Component;

import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.Equipo;
import prubalaboratorio.demo.Model.EquipoModel;

@Component("equipoConverter")
public class EquipoConverter {




    public Equipo convertirEquipoModelaEquipo(EquipoModel equipoModel){
        Equipo equipo = new Equipo();

        equipo.setIdEquipo(equipoModel.getIdEquipo());
        equipo.setMarca(equipoModel.getMarca());
        equipo.setCosto(equipoModel.getCosto());
        equipo.setCantidad(equipoModel.getCantidad());
        equipo.setModelo(equipoModel.getModelo());

        equipo.setRam(equipoModel.getRam());
        equipo.setProcesador(equipoModel.getProcesador());
        equipo.setCapacidad(equipoModel.getCapacidad());
        equipo.setSOperativo(equipoModel.getSOperativo());
        equipo.setTipoUso(equipoModel.getTipoUso());
        equipo.setEstadoEquipo(equipoModel.getEstadoEquipo());
        equipo.setSolicitante(equipoModel.getSolicitante());


        return equipo;
    }

    public EquipoModel convertirEquipoaEquipoModel(Equipo equipo){

        EquipoModel equipoModel = new EquipoModel();
        equipoModel.setIdEquipo(equipo.getIdEquipo());
        equipoModel.setCosto(equipo.getCosto());
        equipoModel.setCantidad(equipo.getCantidad());
        equipoModel.setModelo(equipo.getModelo());

        equipoModel.setRam(equipo.getRam());
        equipoModel.setProcesador(equipo.getProcesador());
        equipoModel.setCapacidad(equipo.getCapacidad());
        equipoModel.setSOperativo(equipo.getSOperativo());
        equipoModel.setTipoUso(equipo.getTipoUso());
        equipoModel.setEstadoEquipo(equipo.getEstadoEquipo());
        equipoModel.setSolicitante(equipo.getSolicitante());

        return equipoModel;
    }
}