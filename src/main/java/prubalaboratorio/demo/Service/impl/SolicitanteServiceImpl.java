package prubalaboratorio.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import prubalaboratorio.demo.Component.SolicitanteConverter;
import prubalaboratorio.demo.Component.UsuarioConverter;
import prubalaboratorio.demo.Entity.Solicitante;
import prubalaboratorio.demo.Model.SolicitanteModel;
import prubalaboratorio.demo.Repository.SolicitanteRepository;
import prubalaboratorio.demo.Service.SolicitanteService;


@Service("solicitanteServiceImpl")
public class SolicitanteServiceImpl implements SolicitanteService {
    @Autowired
    @Qualifier("solicitanteRepository")
    SolicitanteRepository solicitanteRepository;

    @Autowired
    @Qualifier("solicitanteConverter")
    SolicitanteConverter solicitanteConverter;
    @Override
    public Solicitante findSolicitanteByIdSolicitante(int idSolicitante) {
        return solicitanteRepository.findByIdSolicitante(idSolicitante);
    }

    @Override
    public SolicitanteModel findSolicitanteByIdSolicitanteModel(int idSolicitante) {


        return solicitanteConverter.convertirSolicitanteaSolicitanteModel(findSolicitanteByIdSolicitante(idSolicitante));
    }
}
