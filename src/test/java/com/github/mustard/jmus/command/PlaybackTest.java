package com.github.mustard.jmus.command;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PlaybackTest {
    
    @Test
    public void shouldGetNextCommand() {
        assertThat(Playback.NEXT.getCommand(), equalTo("player-next"));
    }
    
    @Test
    public void shouldGetPreviousCommand() {
        assertThat(Playback.PREV.getCommand(), equalTo("player-prev"));
    }
    
    @Test
    public void shouldGetToggleShuffleCommand() {
        assertThat(Playback.SHUFFLE.getCommand(), equalTo("toggle shuffle"));
    }
    
    @Test
    public void shouldGetToggleRepeatCommand() {
        assertThat(Playback.REPEAT.getCommand(), equalTo("toggle repeat"));
    }

    @Test
    public void shouldGetPauseCommand() {
        assertThat(Playback.PAUSE.getCommand(), equalTo("player-pause"));
    }
    
    @Test
    public void shouldGetPlayCommand() {
        assertThat(Playback.PLAY.getCommand(), equalTo("player-play"));
    }
}
