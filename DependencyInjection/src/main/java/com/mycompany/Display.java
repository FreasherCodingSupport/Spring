
package com.mycompany;

public class Display {
    Message msg;
    public void setMessage(Message msg){
        System.out.println("~~~~~~~~~~setMessage~~~~~~~~~~~~~~~~~");
        this.msg=msg;
   } 
    public void Show(){
        System.out.println("-->"+msg.getMessage());
    }
}
