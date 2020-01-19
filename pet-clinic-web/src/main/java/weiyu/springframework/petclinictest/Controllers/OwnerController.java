package weiyu.springframework.petclinictest.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import weiyu.springframework.petclinictest.Services.OwnerService;
//@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owner",ownerService.findAll());
        return "owners/index";
    }
    @RequestMapping ("/owners/find")
    public String findOwners(){
        return "NotImplemented";
    }
}
