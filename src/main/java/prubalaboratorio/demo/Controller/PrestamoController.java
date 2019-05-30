package prubalaboratorio.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import prubalaboratorio.demo.Constant.ViewConstants;

@Controller
@RequestMapping("/prestamo")
public class PrestamoController {

   @GetMapping("/index")
    public String buscarMatricula(){
        return  ViewConstants.BUSCARMATRICULA;
    }
}
