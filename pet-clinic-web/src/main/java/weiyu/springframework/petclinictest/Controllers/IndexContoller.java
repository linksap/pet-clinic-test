package weiyu.springframework.petclinictest.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContoller {
    @RequestMapping ({"","/","index","index.html"})
    public String index(){
        return "index";
    }
    @RequestMapping ("/oups")
    public String oups(){
        return "NotImplemented";
    }
}
