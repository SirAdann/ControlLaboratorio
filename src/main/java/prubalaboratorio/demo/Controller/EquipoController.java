package prubalaboratorio.demo.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import prubalaboratorio.demo.Constant.ViewConstants;
import prubalaboratorio.demo.Model.EquipoModel;
import prubalaboratorio.demo.Model.UsuarioModel;
import prubalaboratorio.demo.Service.impl.EquipoServiceImpl;

@Controller
@RequestMapping("/materiales")
public class EquipoController {

    @Autowired
    @Qualifier("equipoServiceImpl")
    EquipoServiceImpl equipoService;

    private static final Log log = LogFactory.getLog(EquipoController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/materiales/showEquipo";
    }

    @GetMapping("/index")
    public ModelAndView MostrarEquipos(){

        ModelAndView mav = new ModelAndView(ViewConstants.EQUIPO);
        mav.addObject("equipo", equipoService.listAllEquipos());


        return mav;
    }

    @GetMapping("/form")
    public String redirectEquipoForm(Model model, @RequestParam(name = "idEquipo", required = false) int idEquipo) {


        EquipoModel equipoModel = new EquipoModel();
        if(idEquipo!=0) {
            equipoModel = equipoService.findEquipoByIdEquipoModel(idEquipo);
            System.out.println("MODELO : "+ equipoModel);
        }

        model.addAttribute("equipoModel", equipoModel);
        return ViewConstants.EQUIPO;
    }

    @PostMapping("/addequipo")
    public String addUser(@ModelAttribute(name = "equipoModel") EquipoModel equipoModel, Model model) {
        log.info("Method: addEquipo() -- Params: " + equipoModel.toString());
        if (equipoService.addEquipo(equipoModel) != null)
            model.addAttribute("result", 1);
        else
            model.addAttribute("result", 0);
        return "redirect:/materiales/index";
    }

    @GetMapping("/remove")
    public ModelAndView removerEquipo(@RequestParam(name = "idEquipo", required = true) int idEquipo) {
        equipoService.removerEquipo(idEquipo);
        return MostrarEquipos();
    }

}
