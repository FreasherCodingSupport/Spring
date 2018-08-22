package com.mycompany;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;

@Controller
public class ServletUseController implements ServletContextAware {

    ServletContext application;
    @RequestMapping("/test")
    
public void test(HttpServletRequest request, HttpServletResponse response) throws IOException{
    response.setContentType("text/html");
    String reqMethod = request.getMethod();
    String reqIp = request.getRemoteAddr();
    PrintWriter out = response.getWriter();
    out.println(" Method:- "+reqMethod);
    out.println(" <br/>Client IP:- "+reqIp);
        System.out.println(" Method:- "+reqMethod);
        System.out.println(" Client IP:- "+reqIp);
}

    /**
     * When @ResponseBody is added the return value will be directly send to browser.
     * Not to its jsp page.
     * @return 
     */

 @RequestMapping("/test2")
 @ResponseBody   
public String test2(HttpSession session){
     return "Session ID:"+session.getId();
}    
    
 @RequestMapping("/test3")
 @ResponseBody   
public String test3() {
     return "Server ID:"+application.getServerInfo();
}

/**
 @RequestMapping("/test4")
 @ResponseBody   
public String test4(ServletContext application) {
     return "Server ID:"+application.getServerInfo();
}
  */

@Override
    public void setServletContext(ServletContext sc) {
        this.application = sc;
    
    }
    
}
