package prubalaboratorio.demo.Service;

import prubalaboratorio.demo.Entity.Material;
import prubalaboratorio.demo.Model.MaterialModel;

import java.util.List;

public interface MaterialService {

    public abstract MaterialModel addMaterial(MaterialModel usuarioModel);

    public abstract List<MaterialModel> listAllMaterials();

    public abstract Material findUsuarioByIdMaterial(String idMaterial);

    public abstract void removerMaterial(String idMaterial);

    public abstract MaterialModel findMaterialByIdMaterialModel(String idMaterial);
}
