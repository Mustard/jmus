package com.github.mustard.jmus.command;

/**
 * @author Daniel
 */
public enum Playback implements Command {

    NEXT("player-next"),
    PREV("player-prev"),
    SHUFFLE("toggle shuffle"),
    REPEAT("toggle repeat"),
    PAUSE("player-pause"),
    PLAY("player-play")
    ;
    
    private final String command;
        
    private Playback(final String command) {
        this.command = command;
    }

    @Override
    public String getCommand() {
        return command;
    }
    
}
