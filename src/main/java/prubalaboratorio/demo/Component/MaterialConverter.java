package prubalaboratorio.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.TipoMaterial;
import prubalaboratorio.demo.Entity.Material;
import prubalaboratorio.demo.Model.MaterialModel;
import prubalaboratorio.demo.Repository.TipoMaterialRepository;

@Component("materialConverter")
public class MaterialConverter {

    @Autowired
    @Qualifier("tipoMaterialRepository")
    private TipoMaterialRepository tipoMaterialRepository;

    public Material convertirMaterialModelaMaterial(MaterialModel materialModel){
        Material material = new Material();

        material.setIdMaterial(materialModel.getIdMaterial());
        material.setMarca(materialModel.getMarca());
        material.setCosto(materialModel.getCosto());
        material.setCantidad(materialModel.getCantidad());
        material.setModelo(materialModel.getModelo());

        TipoMaterial tipoMaterial = tipoMaterialRepository.findByIdTipoMaterial(materialModel.getIdTipoMaterial);
        material.setRam(materialModel.getRam());
        material.setProcesador(materialModel.getProcesador());
        material.setCapacidad(materialModel.getCapacidad());
        material.setSOperativo(materialModel.getSOperativo());
        material.setTipoUso(materialModel.getTipoUso());
        material.setEstadoMaterial(materialModel.getEstadoMaterial());
        material.setSolicitante(materialModel.getSolicitante());

        material.setIdtipomaterial(tipoMaterial);

        return material;
    }

    public Material convertirMaterialaMaterialModel(Material material){

        MaterialModel materialModel = new MaterialModel();
        materialModel.setIdMaterial(material.getIdMaterial());
        materialModel.setCosto(material.getCosto());
        materialModel.setCantidad(material.getCantidad());
        materialModel.setModelo(material.getModelo());

        materialModel.setIdTipoMaterial(material.getIdtipomaterial().getIdTipoMaterial());
        materialModel.setRam(material.getRam());
        materialModel.setProcesador(material.getProcesador());
        materialModel.setCapacidad(material.getCapacidad());
        materialModel.setSOperativo(material.getSOperativo());
        materialModel.setTipoUso(material.getTipoUso());
        materialModel.setEstadoMaterial(material.getEstadoMaterial());
        materialModel.setSolicitante(material.getSolicitante());

        return materialModel;
    }
}