package prubalaboratorio.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.Herramienta;
import prubalaboratorio.demo.Entity.TipoHerramienta;
import prubalaboratorio.demo.Model.HerramientaModel;
import prubalaboratorio.demo.Repository.TipoHerramientaRepository;

@Component("herramientasConverter")
public class HerramientasConverter {
    @Autowired
    @Qualifier("tipoHerramientaRepository")
    private TipoHerramientaRepository tipoHerramientaRepository;

    public Herramienta convertirHerramientasModelHerramientas(HerramientaModel herramientaModel) {
        Herramienta herramienta = new Herramienta();
        herramienta.setIdHerramienta(herramientaModel.getIdHerramienta());
        herramienta.setMarca(herramientaModel.getMarca());
        herramienta.setCosto(herramientaModel.getCosto());
        herramienta.setCantidad(herramientaModel.getCantidad());
        herramienta.setModelo(herramientaModel.getModelo());
        TipoHerramienta tipoHerramienta = tipoHerramientaRepository.findByIdTipoHerramienta(herramientaModel.getTipoHerramienta());
        herramienta.setTipoHerramienta(tipoHerramienta);
        herramienta.setTipoUso(herramientaModel.getTipoUso());
        herramienta.setSolicitante(herramientaModel.getSolicitante());
        return herramienta;
    }

    public HerramientaModel convertirHerramientaaHerramientaModel(Herramienta herramienta){
        HerramientaModel herramientaModel = new HerramientaModel();
        herramientaModel.setIdHerramienta(herramienta.getIdHerramienta());
        herramientaModel.setMarca(herramienta.getMarca());
        herramientaModel.setCosto(herramienta.getCosto());
        herramientaModel.setCantidad(herramienta.getCantidad());
        herramientaModel.setModelo(herramienta.getModelo());
        herramientaModel.setTipoHerramienta(herramienta.getTipoHerramienta().getIdTipoHerramienta());
        herramientaModel.setTipoUso(herramienta.getTipoUso());
        herramientaModel.setSolicitante(herramienta.getSolicitante());
        return herramientaModel;
    }

}
