package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InquiryController {
 
 @Autowired
 
 InquiryService inquiryService;
 
 @RequestMapping("/inq_form")
   public String prepare(Model m){ 
        System.out.println("prepareForm()"); 
    //Form Preparation
    
    //1. Reference data
      m.addAttribute("cityList",inquiryService.getCityList());//accessiable in jsp form
      m.addAttribute("courseList",inquiryService.getCourseList());//accessiable in jsp form
         
    //2. defalt selected value
      InquiryCommand cmd = new InquiryCommand();
      cmd.setGender("F");//default gender value
      cmd.setCourses(new String[]{"JAVA","ANDROID"});//default courses
      cmd.setSelectedCityId(101);// default city value
      m.addAttribute("command",cmd);//used in form tag jsp"modelAttribute=command"  
      
    //3. Form selection to display
     return "inq_form";//jsp
   }
      
   
   @RequestMapping("/saveInq")
   public String saveInquiry(@ModelAttribute InquiryCommand command){ 
       System.out.println("Inquiry Form Data:- ");
       System.out.println("Name: "+command.getName());
       System.out.println("Phone: "+command.getPhone());
       System.out.println("Gender: "+command.getGender());
       System.out.println("City Id: "+command.getSelectedCityId());
       System.out.println("Address: "+command.getAddress());
       System.out.println("Couses: ");
       
       for(String co:command.getCourses()){
           System.out.println(co+",");
           System.out.println();
       }
       System.out.println("T&C: "+command.gettNc());
       
    //todo: call a biz or service methods to save data into data-base
       return "success";//jsp
   }
}
