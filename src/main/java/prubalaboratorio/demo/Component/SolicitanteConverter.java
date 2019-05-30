package prubalaboratorio.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import prubalaboratorio.demo.Entity.Solicitante;
import prubalaboratorio.demo.Model.SolicitanteModel;
import prubalaboratorio.demo.Repository.TipoSolicitanteRepository;

public class SolicitanteConverter {

    @Autowired
    @Qualifier("tipoSolicitanteRepository")
    private TipoSolicitanteRepository tipoSolicitanteRepository;

    public Solicitante convertirSolicitanteModelaSolicitante(SolicitanteModel solicitanteModel) {
        Solicitante solicitante= new Solicitante();








    return solicitante;
    }



    public SolicitanteModel convertirSolicitanteaSolicitanteModel(Solicitante solicitante) {
        SolicitanteModel solicitanteModel= new SolicitanteModel();








        return solicitanteModel;
    }


    }
