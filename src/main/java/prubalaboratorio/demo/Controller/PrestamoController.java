package prubalaboratorio.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import prubalaboratorio.demo.Constant.ViewConstants;
import prubalaboratorio.demo.Model.SolicitanteModel;
import prubalaboratorio.demo.Service.impl.SolicitanteServiceImpl;

@Controller
@RequestMapping("/prestamo")
public class PrestamoController {

    @Autowired
    @Qualifier("solicitanteServiceImpl")
    SolicitanteServiceImpl solicitanteService;

    @GetMapping("/index")
    public String buscarMatricula() {

        return "ListaMaterial2";
    }


    @GetMapping("/solicitante")
    public String consultarPrestamosEquipos(Model model, @RequestParam(name = "idSolicitante", required = false) int idSolicitante) {
        System.out.println("Id del solicitante: " + idSolicitante);

        SolicitanteModel solicitanteModel = new SolicitanteModel();
        if (idSolicitante != 0) {
            solicitanteModel= solicitanteService.findSolicitanteByIdSolicitanteModel(idSolicitante);
            System.out.println("MODELO : " + solicitanteModel);
            if (solicitanteModel.equals(null)) {
                System.out.println("no se encontro solicitante");

                model.addAttribute("respuesta","no se encontro solicitante");
            } else {
                model.addAttribute("solicitanteModel", solicitanteModel);

                return "redirect:/prestamo/index";

            }
            return ViewConstants.BUSCARMATRICULA;

        }

    return "";
    }
}
