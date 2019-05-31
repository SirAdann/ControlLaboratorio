package prubalaboratorio.demo.Service;

import prubalaboratorio.demo.Entity.Solicitante;
import prubalaboratorio.demo.Model.SolicitanteModel;
import prubalaboratorio.demo.Model.UsuarioModel;

public interface SolicitanteService {

    public abstract Solicitante findSolicitanteByIdSolicitante(int idSolicitante);

    public abstract SolicitanteModel findSolicitanteByIdSolicitanteModel(int idSolicitante);
}
