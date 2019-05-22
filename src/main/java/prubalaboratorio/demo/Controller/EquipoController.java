package prubalaboratorio.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import prubalaboratorio.demo.Constant.ViewConstants;
import prubalaboratorio.demo.Model.EquipoModel;
import prubalaboratorio.demo.Service.impl.EquipoServiceImpl;

@Controller
@RequestMapping("materiales")
public class EquipoController {

    @Autowired
    @Qualifier("equipoServiceImpl")
    EquipoServiceImpl equipoServiceimpl;

    @GetMapping("index")
    public String MostrarEquipos(){

        return "";
    }

    @GetMapping("/form")
    public String redirectEquipoForm(Model model, @RequestParam(name = "idEquipo", required = false) int idEquipo) {


        EquipoModel equipoModel = new EquipoModel();
        if(idEquipo!=0) {
            equipoModel = equipoServiceimpl.findEquipoByIdEquipoModel(idEquipo);
            System.out.println("MODELO : "+ equipoModel);
        }

        model.addAttribute("equipoModel", equipoModel);
        return ViewConstants.EQUIPO;
    }


}
