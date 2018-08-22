package com.mycompany;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
        
        HelloBean bean = ctx.getBean(HelloBean.class);
         String msg= bean.greeting();
         System.out.println("Message:- "+msg);
    }
    //EmpService service= ctx getBean(EmpService.class);
    //service.save();
}
