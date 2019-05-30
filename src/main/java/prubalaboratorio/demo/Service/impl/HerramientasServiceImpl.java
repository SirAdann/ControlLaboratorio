package prubalaboratorio.demo.Service.impl;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import prubalaboratorio.demo.Component.HerramientasConverter;
import prubalaboratorio.demo.Entity.Herramienta;
import prubalaboratorio.demo.Model.HerramientaModel;
import prubalaboratorio.demo.Repository.HerramientasRepository;
import prubalaboratorio.demo.Service.HerramientasService;

import java.util.ArrayList;
import java.util.List;

@Service("herramientasServiceImpl")
public class HerramientasServiceImpl implements HerramientasService {
    @Autowired
    @Qualifier("herramientasRepository")
    HerramientasRepository herramientasRepository;

    @Autowired
    @Qualifier("herramientasConverter")
    HerramientasConverter herramientasConverter;

    @Override
    public HerramientaModel addHerramientas(HerramientaModel herramientaModel) {
        Herramienta temp = herramientasConverter.convertirHerramientasModelHerramientas(herramientaModel);
        Herramienta herramienta = herramientasRepository.save(temp);
        return herramientasConverter.convertirHerramientaaHerramientaModel(herramienta);
    }

    @Override
    public List<HerramientaModel> listAllHerramientas() {
        List <Herramienta> herramientas= herramientasRepository.findAll();

        List<HerramientaModel> herramientaModels = new ArrayList();
        for (Herramienta herramienta : herramientas)
            herramientaModels.add(herramientasConverter.convertirHerramientaaHerramientaModel(herramienta));
        return herramientaModels;
    }

    @Override
    public Herramienta findHerramientasByIdHerramientas(int id) {
        return herramientasRepository.findByIdHerramienta(id);
    }

    @Override
    public void removerHerramienta(int id) {
        Herramienta herramienta = findHerramientasByIdHerramientas(id);
        if(herramienta != null)
            herramientasRepository.delete(findHerramientasByIdHerramientas(id));
    }

    @Override
    public HerramientaModel findHerramientasByIdHerramientasModel(int id) {
        return herramientasConverter.convertirHerramientaaHerramientaModel(findHerramientasByIdHerramientas(id));
    }

}}*/

