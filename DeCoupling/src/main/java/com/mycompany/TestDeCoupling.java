
package com.mycompany;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeCoupling {

    public static void main(String[] args) {
     ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
     
     MessageRenderer mr= ctx.getBean(MessageRenderer.class);
    // mr.setMessageProvider(provider);// not needed
     mr.render();
        System.out.println("Current Directory: "+System.getProperty("user.dir"));
        System.out.println("Operatiins System: "+System.getProperty("os.name"));
        System.out.println("java Version: "+System.getProperty("java.version"));
    } 
}
