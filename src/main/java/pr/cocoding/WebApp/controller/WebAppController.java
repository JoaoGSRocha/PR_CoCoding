package pr.cocoding.WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class WebAppController{
 
   @RequestMapping("/hello")
   public ModelAndView printHello(ModelMap model) {
	  String message = "Spring MVC!";
      return new ModelAndView("helloPage", "message", message);
   }
}