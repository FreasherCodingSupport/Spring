package com.mycompany;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
  
    //DI
    @Autowired  
  private EmpService empService;
    
  @RequestMapping(value={"/empList","/emp/list"})
  public String empList(Model m){
      //List <Emp> emps = empService.getEmpList();
      //m.addAttribute("emps",emps);
      m.addAttribute("emps",empService.getEmpList());
      return "elist";//jsp
      
  }
}
