package poly.edu.controller.Lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    // Link: http://localhost:8080/poly/hello

    @RequestMapping("/poly/hello")
    public String MyHello(Model model){
        return "poly/hello";
    }
}
