package poly.edu.controller.Lab2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

    // Link: http://localhost:8080/param/form
    @GetMapping("/param/form")
    public String form() {
        return "Lab2/form";
    }

    @PostMapping("/param/save/{x}")
    public String save(@PathVariable("x") String x,
                       @RequestParam("y") String y,
                       Model model) {
        model.addAttribute("x", x);
        model.addAttribute("y", y);
        return "Lab2/form";
    }
}
