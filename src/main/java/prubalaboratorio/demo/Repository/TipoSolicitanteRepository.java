package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.TipoSolicitante;

import java.io.Serializable;

@Repository("tipoSolicitanteRepository")
public interface TipoSolicitanteRepository extends JpaRepository<TipoSolicitante, Serializable> {
    public abstract TipoSolicitante findByIdTipoSolicitante(int idTipoSolicitante);

}
