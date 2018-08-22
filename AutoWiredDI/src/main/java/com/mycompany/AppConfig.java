
package com.mycompany;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring.xml")
@ComponentScan(basePackages={"com.mycompany"})

public class AppConfig {
   

}
