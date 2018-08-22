package com.mycompany;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAutoWiredDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext  ctx= new AnnotationConfigApplicationContext(AppConfig.class);
        try{
            EmpService service= ctx.getBean(EmpService.class);
            Emp e= new Emp("Riky","r@");
            service.save(e);   
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
