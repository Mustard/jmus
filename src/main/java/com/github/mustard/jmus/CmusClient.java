package com.github.mustard.jmus;

import com.github.mustard.jmus.command.Command;
import java.io.IOException;

/**
 * @author Daniel
 */
public class CmusClient {
    
    private final String host;
    private final int port;
    private final String password;
    
    public CmusClient(final String host, final int port, final String password) {
        this.host = host;
        this.port = port;
        this.password = password;
    }
    
    public String getHost() {
        return host;
    }
    
    public int getPort() {
        return port;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void issueCommand(Command command) throws IOException {
        CmusCommandDispatcher dispatcher = new CmusCommandDispatcher(this);
        dispatcher.dispatch(command);
    }
    
}
