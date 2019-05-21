package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.TipoMaterial;

import java.io.Serializable;

@Repository("tipoMaterialRepository")
public interface TipoMaterialRepository extends JpaRepository<TipoMaterial, Serializable> {

    public abstract TipoMaterial findByIdTipoMaterial(int idTipoMaterial);

}
