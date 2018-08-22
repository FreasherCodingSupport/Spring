
package com.mycompany;

public class HelloMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        System.out.println("getMessage()");
       return "HELLO EVERY ONE!!";
    }
    
}
