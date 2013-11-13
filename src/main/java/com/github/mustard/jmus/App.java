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
        client.issueCommand(Volume.UP);
        client.issueCommand(Volume.DOWN);
        client.issueCommand(Playback.PLAY);
        client.issueCommand(Playback.PAUSE);
        // Get the current status, now playing etc
        CmusResponse response = client.issueCommand(Meta.STATUS);
    }
}
