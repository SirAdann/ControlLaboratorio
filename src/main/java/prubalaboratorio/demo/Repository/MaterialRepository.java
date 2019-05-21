package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.Material;

import java.io.Serializable;

@Repository("materialRepository")
public interface MaterialRepository extends JpaRepository<Material,Serializable>{

        public abstract Material findByIdMaterial(String idMaterial);



    }
