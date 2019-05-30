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
import prubalaboratorio.demo.Model.HerramientaModel;
import prubalaboratorio.demo.Service.impl.HerramientasServiceImpl;

@Controller
@RequestMapping("/herramientas")
public class HerramientaController {

    @Autowired
    @Qualifier("herramientasServiceImpl")
    HerramientasServiceImpl herramientasService;

    private static final Log log = LogFactory.getLog(HerramientaController.class);

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/herramientas/showHerramientas";
    }

    @GetMapping("/index")
    public ModelAndView MostrarHerramientas(){
        ModelAndView mav = new ModelAndView(ViewConstants.HERRAMIENTAS);
        mav.addObject("herramientas", herramientasService.listAllHerramientas());
        return mav;
    }

    @GetMapping("/form")
    public String redirectHerramientaForm(Model model, @RequestParam(name = "id", required = false) Integer id) {
        id=0;
        HerramientaModel herramientaModel = new HerramientaModel();
        if(id!=0) {
            herramientaModel = herramientasService.findHerramientasByIdHerramientasModel(id);
            System.out.println("HERRAMIENTA : "+ herramientaModel);
        }
        model.addAttribute("herramientaModel", herramientaModel);
        return ViewConstants.HERRAMIENTAS;
    }

    @PostMapping("/addHerramientas")
    public String addHerramienta(@ModelAttribute(name = "herramientaModel") HerramientaModel herramientaModel, Model model) {
        log.info("Method: addHerramientas() -- Params: " + herramientaModel.toString());
        if (herramientasService.addHerramientas(herramientaModel) != null)
            model.addAttribute("result", 1);
        else
            model.addAttribute("result", 0);
        return "redirect:/herramientas/form";
    }

    @GetMapping("/remove")
    public ModelAndView removerHerramienta(@RequestParam(name = "id", required = true) int id) {
        herramientasService.removerHerramienta(id);
        return MostrarHerramientas();
    }

}
