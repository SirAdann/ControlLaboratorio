package prubalaboratorio.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import prubalaboratorio.demo.Component.MaterialConverter;
import prubalaboratorio.demo.Entity.Material;
import prubalaboratorio.demo.Model.MaterialModel;
import prubalaboratorio.demo.Repository.MaterialRepository;
import prubalaboratorio.demo.Service.MaterialService;

import java.util.ArrayList;
import java.util.List;

@Service("materialServiceImpl")
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    @Qualifier("materialRepository")
    MaterialRepository materialRepository;

    @Autowired
    @Qualifier("materialConverter")
    MaterialConverter materialConverter;



    @Override
    public MaterialModel addMaterial(MaterialModel materialModel) {

        Material temp = materialConverter.convertirMaterialModelaMaterial(materialModel);
        Material mat = materialRepository.save(temp);
        return materialConverter.convertirMaterialaMaterialModel(mat);
    }

    @Override
    public List<MaterialModel> listAllMaterials() {
        List <Material> materiales= materialRepository.findAll();

        List<MaterialModel> materialModels = new ArrayList();
        for (Material mat : materiales)
            materialModels.add(materialConverter.convertirMaterialaMaterialModel(mat));
        return materialModels;

    }

    @Override
    public Material findMaterialByIdMaterial(String idMaterial) {



        return materialRepository.findByIdMaterial(idMaterial);
    }

    @Override
    public void removerMaterial(String idMaterial) {
        Material material = findUsuarioByIdMaterial(idMaterial);
        if(material != null)
            materialRepository.delete(findMaterialByIdMaterial(idMaterial));
    }

    @Override
    public MaterialModel findUserByIdMaterialModel(String idMaterial) {

        return materialConverter.convertirMaterialaMaterialModel(findUsuarioByIdMaterial(idMaterial));
    }
}
