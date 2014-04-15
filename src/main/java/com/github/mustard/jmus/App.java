package com.github.mustard.jmus;

import com.github.mustard.jmus.command.Meta;
import com.github.mustard.jmus.command.Playback;
import com.github.mustard.jmus.command.Volume;
import java.io.IOException;

/**
 * Demo application
 */
public class App {

    public static void main(String[] args) throws IOException {
        CmusClient client = new  CmusClient("192.168.3.99", 9898, "foobar");
        client.command(Volume.UP);
        client.command(Volume.DOWN);
        client.command(Playback.PLAY);
        client.command(Playback.PAUSE);
        // Get the current status, now playing etc
        Response response = client.command(Meta.STATUS);
    }
}
