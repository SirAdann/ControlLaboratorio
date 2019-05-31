package prubalaboratorio.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import prubalaboratorio.demo.Entity.Solicitante;
import prubalaboratorio.demo.Entity.TipoSolicitante;
import prubalaboratorio.demo.Model.SolicitanteModel;
import prubalaboratorio.demo.Repository.TipoSolicitanteRepository;

@Component("solicitanteConverter")
public class SolicitanteConverter {

    @Autowired
    @Qualifier("tipoSolicitanteRepository")
    private TipoSolicitanteRepository tipoSolicitanteRepository;

    public Solicitante convertirSolicitanteModelaSolicitante(SolicitanteModel solicitanteModel) {
        Solicitante solicitante= new Solicitante();

        solicitante.setIdSolicitante(solicitanteModel.getIdSolicitante());
        solicitante.setNombres(solicitanteModel.getNombres());
        solicitante.setApellidos(solicitante.getApellidos());
        solicitante.setEstado(solicitante.getEstado());
        solicitante.setCarrera(solicitante.getCarrera());
        solicitante.setSemestre(solicitanteModel.getSemestre());

        TipoSolicitante tipoSolicitante =tipoSolicitanteRepository.findByIdTipoSolicitante(solicitanteModel.getIdTipoSolicitante());

    return solicitante;
    }



    public SolicitanteModel convertirSolicitanteaSolicitanteModel(Solicitante solicitante) {
        SolicitanteModel solicitanteModel= new SolicitanteModel();


        solicitanteModel.setIdSolicitante(solicitante.getIdSolicitante());
        solicitanteModel.setNombres(solicitante.getNombres());
        solicitanteModel.setApellidos(solicitante.getApellidos());
        solicitanteModel.setEstado(solicitante.getEstado());
        solicitanteModel.setCarrera(solicitante.getCarrera());
        solicitanteModel.setSemestre(solicitante.getSemestre());

        TipoSolicitante tipoSolicitante =tipoSolicitanteRepository.findByIdTipoSolicitante(solicitanteModel.getIdTipoSolicitante());

        return solicitanteModel;
    }


    }
