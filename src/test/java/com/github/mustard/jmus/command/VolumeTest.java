package com.github.mustard.jmus.command;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class VolumeTest {

    @Test
    public void shouldGetVolumeUpCommand() {
        assertThat(Volume.UP.getCommand(), equalTo("vol +10%"));
    }

    @Test
    public void shouldGetVolumeDownCommand() {
        assertThat(Volume.DOWN.getCommand(), equalTo("vol -10%"));
    }
}
