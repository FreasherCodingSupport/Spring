
package com.mycompany;

public interface MessageRenderer {
    // Renderer required Provider
    public void setMessageProvider(MessageProvider messageProvider);
    public void render();
}
