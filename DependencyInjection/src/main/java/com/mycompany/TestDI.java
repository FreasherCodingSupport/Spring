
package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    public static void main(String[] args) {
       ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
       //class<Display> type= Display.class;
       //Display d = ctx.getBean(type);
       Display d = ctx.getBean(Display.class);// highly cohesion concept
       d.Show();
    }
    
}
