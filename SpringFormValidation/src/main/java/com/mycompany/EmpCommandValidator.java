package com.mycompany;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class EmpCommandValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
  //this validator class will only vailidate EmpCommand object      
        return type.isAssignableFrom(EmpCommand.class) ;
       
    }

    @Override
    public void validate(Object cmd, Errors errors) {
         EmpCommand command = (EmpCommand) cmd;
         ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name",null,null,"Name is mandatory");
         ValidationUtils.rejectIfEmptyOrWhitespace(errors,"salary",null,null,"Salary is mandatory");
         
         Float sal = command.getSalary();
         
         if(sal!=null&& sal<10000){
          errors.rejectValue("salary",null,null,"Salary must be more than 10000/-");
         }
         
         ValidationUtils.rejectIfEmptyOrWhitespace(errors,"remark",null,null,"Remark is mandatory");
        }
    }
    

