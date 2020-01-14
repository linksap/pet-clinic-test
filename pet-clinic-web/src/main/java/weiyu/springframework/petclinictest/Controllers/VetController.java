package weiyu.springframework.petclinictest.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import weiyu.springframework.petclinictest.Services.OwnerService;
import weiyu.springframework.petclinictest.Services.VetService;

@Controller
public class VetController {
    private final VetService vetService;

    public VetController(weiyu.springframework.petclinictest.Services.VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"vets","/vets/index","vets/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }
}
