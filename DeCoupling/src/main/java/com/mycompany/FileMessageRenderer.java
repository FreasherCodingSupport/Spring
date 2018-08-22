package com.mycompany;

import java.io.FileWriter;
import java.io.IOException;

public class FileMessageRenderer implements MessageRenderer {
   MessageProvider messageProvider;
    
    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
     this.messageProvider = messageProvider;
        }

    @Override
    public void render() {
        try{
        FileWriter fw= new FileWriter("msg.txt");
        fw.write(messageProvider.getMessage());
        fw.close();// use finally block
        System.out.println("Message is wrote in project trainng folder. check it!");
    }catch(IOException ex){
        ex.printStackTrace();
    }
    }
    
}
