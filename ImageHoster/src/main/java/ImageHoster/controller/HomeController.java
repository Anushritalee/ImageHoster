package ImageHoster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    
    public String getAllImagePosts(Model model){

        model.addAttribute("images",imageService.getAllImages());
        return "index";
    }
}
