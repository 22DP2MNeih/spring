package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
//    @GetMapping(value = "/")
//     String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
//         return "index";
//     }

//     @GetMapping(value = "/abc")
//     String index2(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
//         return "abc";
//     }

    @GetMapping(value = "/test")
    ModelAndView testAction() {
        ModelAndView modelAndView = new ModelAndView("/test");
        Money macins1 = new Money(10, 9);
        modelAndView.addObject("macins1", macins1);
        return modelAndView;
    }
    
}
