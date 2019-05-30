package prubalaboratorio.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prubalaboratorio.demo.Entity.EstadoPrestamoHerramienta;

import java.io.Serializable;

@Repository("estadoPrestamoHerramientasRepository")
public interface EstadoPrestamoHerramientasRepository extends JpaRepository<EstadoPrestamoHerramienta, Serializable> {
    public abstract EstadoPrestamoHerramienta findByIdEstado(int idEstado);
}
