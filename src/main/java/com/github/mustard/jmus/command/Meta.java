package com.github.mustard.jmus.command;

/**
 * @author Daniel
 */
public enum Meta implements CommandWithResponse {

    STATUS("status")
    ;
    private final String command;
    
    private Meta(final String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
