package prubalaboratorio.demo.Repository;

import prubalaboratorio.demo.Entity.Herramienta;

public interface HerramientasRepository {
    public abstract Herramienta findByIdEquipo(int idHerramienta);

}
