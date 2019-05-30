package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.Solicitante;

import java.io.Serializable;

@Repository("solicitanteRepository")
public interface SolicitanteRepository extends JpaRepository <Solicitante, Serializable> {

    abstract Solicitante findByIdSolicitante(int idSolicitante);
}
