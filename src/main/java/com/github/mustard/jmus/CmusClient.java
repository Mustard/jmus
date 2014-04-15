package com.github.mustard.jmus;

import com.github.mustard.jmus.command.Command;
import com.github.mustard.jmus.command.CommandWithResponse;
import java.io.IOException;

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
    
    public void command(Command command) throws IOException {
        CommandDispatcher dispatcher = new CommandDispatcher(this);
        dispatcher.dispatch(command);
    }
    
    public Response command(CommandWithResponse commandWithResponse) {
        CommandDispatcher dispatcher = new CommandDispatcher(this);
        return dispatcher.dispatchForResponse(commandWithResponse);
    }
    
}
