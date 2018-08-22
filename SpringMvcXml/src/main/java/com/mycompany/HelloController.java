package com.mycompany;


import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
  
    @RequestMapping("/wish")
    public ModelAndView welcome(){
        /**
         * /WEB-INF/view/hello.jsp
         * spring model by default added in request-scope
         */
        ModelAndView mav = new ModelAndView("hello");// viewResolver handle this
        mav.addObject("msg","WELCOME to Spring MVC-1");
        return mav;
    }
    
    @RequestMapping("/wish2")
    public String welcome2( Model m){
        /**
         * /WEB-INF/view/hello.jsp
         * spring model by default added in request-scope
         */
       m.addAttribute("msg","WELCOME to Spring MVC-2");
        return "hello";
    }
    
    @RequestMapping(value={"/","/home"})
    public String home( Model m){
        /**
         * /WEB-INF/view/hello.jsp
         * spring model by default added in request-scope
         */
       m.addAttribute("msg","WELCOME to Spring MVC-home");
        return "hello";
    }
    /**
     * When @ResponseBody is added the return value will be directly send to browser.
     * Not to its jsp page.
     * @return 
     */
    
    @RequestMapping(value="/date")
    @ResponseBody
    public String getDate(){
        return "WELCOME to Spring MVC-"+new Date();
    }
    
}
