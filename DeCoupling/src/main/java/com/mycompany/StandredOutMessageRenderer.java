package com.mycompany;

import java.io.FileWriter;
import static java.nio.channels.spi.AsynchronousChannelProvider.provider;

public class StandredOutMessageRenderer implements MessageRenderer {
 MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
       this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        System.out.println("Message from Provider -->"+messageProvider.getMessage());    
    }
    
}
