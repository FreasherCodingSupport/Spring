package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //replace spring.xml
public class AppConfig {
    @Bean
    public HelloBean createHelloBean(){
        HelloBean b= new HelloBean();
        return b;
        
    }
}
