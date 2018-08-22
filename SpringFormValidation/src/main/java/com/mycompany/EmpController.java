package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class EmpController {

  @Autowired
 private EmpCommandValidator empCommandValidator ;  
  
   @RequestMapping("/eform")
   public String prepareForm(Model m){ 
        System.out.println("prepareForm()"); 
    
    //1. Reference data
    //2. defalt selected value
    
      EmpCommand ec = new EmpCommand();
      m.addAttribute("ecmd",ec);//accessiable in jsp form
    
    //3. Form selection to display 
      return "emp_form";//jsp
       } 
   
   @RequestMapping("/saveEmp")
   public String save(@ModelAttribute("ecmd") EmpCommand ec, BindingResult errors){ 
       empCommandValidator.validate(ec,errors);
       if(errors.hasErrors()){
          return"emp_form"; 
       }
        System.out.println("save()"); 
        System.out.println("Name:-"+ec.getName());
        System.out.println("salary:-"+ec.getSalary());
        System.out.println("remark:-"+ec.getRemark());
    //call aservice method or biz to save the emp data   
        return "success";//jsp
   }   
}
