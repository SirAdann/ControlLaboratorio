package prubalaboratorio.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import prubalaboratorio.demo.Constant.ViewConstants;

@Controller
@RequestMapping(name="/prestamo/equipo")
public class PrestamoEquipoController {




    @GetMapping("/consulta/usuario")
    public String consultarPrestamosEquipos(Model model ,@RequestParam(name = "matricula", required = false) String matricula){



        return "prestamo";// se borra vista se agrega prestamo
    }










}
