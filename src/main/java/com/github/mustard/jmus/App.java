package com.github.mustard.jmus;

import com.github.mustard.jmus.command.Playback;
import java.io.IOException;

/**
 * Demo application
 */
public class App {

    public static void main(String[] args) throws IOException {
        CmusClient client = new  CmusClient("localhost", 9898, "foobar");
        client.issueCommand(Playback.NEXT);
    }
}
