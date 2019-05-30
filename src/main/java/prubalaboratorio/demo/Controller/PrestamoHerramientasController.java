package prubalaboratorio.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(name="herramientas")
public class PrestamoHerramientasController {
    @GetMapping("/consulta/herramientas")
    public String ConsultarPrestamos(Model model , @RequestParam(name = "idSolicitante", required = false) String idSolicitante){
         return "herramientas";// se borra vista se agrega prestamo
    }
}
