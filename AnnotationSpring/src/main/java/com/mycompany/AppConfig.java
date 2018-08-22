package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mycompany"})

public class AppConfig {
   @Bean 
   public HelloBean createHelloBean(){
       HelloBean b= new HelloBean();
        return b;
       
   }
    
}
