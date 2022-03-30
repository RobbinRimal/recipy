package home.recipy.Controller;

import home.recipy.service.RecipiesService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
public class IndexController {
    RecipiesService recipiesService;

    public IndexController(RecipiesService recipiesService) {
        this.recipiesService = recipiesService;
    }

    @RequestMapping({"/","","/index","index.html"})
    public  String getIndex(Model model){
    model.addAttribute("recipies",recipiesService.getrecipe());
    return  "index";
}
}
