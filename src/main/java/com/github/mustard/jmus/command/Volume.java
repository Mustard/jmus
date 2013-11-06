package com.github.mustard.jmus.command;

/**
 * @author Daniel
 */
public enum Volume implements Command {

    UP("vol +10%"), 
    DOWN("vol -10%")
    ;
    
    private final String command;
    
    private Volume(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
    
}
