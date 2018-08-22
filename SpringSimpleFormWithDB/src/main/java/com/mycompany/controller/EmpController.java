package com.mycompany.controller;

import com.mycompany.command.EmpCommand;
import com.mycompany.domain.Emp;
import com.mycompany.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
  
    //DI
    @Autowired  
  private EmpService empService;
    
  @RequestMapping("/eform")
  public String prepareForm(Model m){
      System.out.println("prepareForm()");
   //1. reference data(country list, city list):todo
   //2. default slected vales:todo
      EmpCommand ec = new EmpCommand();
      ec.setSalary(25000.0F);
      m.addAttribute("ecmd",ec);//accessible in jsp form
   //3. form selection to display
      return "emp_form";//jsp
      }
  
  
   @RequestMapping("/saveEmp")
   public String save(@ModelAttribute("ecmd")EmpCommand ec,Model m){
        System.out.println("save()");
        System.out.println("Name:-"+ec.getName());
        System.out.println("Salary:-"+ec.getSalary());
        System.out.println("Remark:-"+ec.getRemark());
        try{
    // binnd data from command to domain        
            Emp e = new Emp();
            e.setName(ec.getName());
            e.setSalary(ec.getSalary());
            e.setRemark(ec.getRemark());
    //Test failed case:System.out.println(10/0);       
            empService.save(e);
            return "success"; //jsp
        }catch(Exception e){
            e.printStackTrace();
            m.addAttribute("err","Failed to save Employee:"+e.getMessage());
            return "emp_form";//jsp(go back to emp_form)
      }
   }
}
