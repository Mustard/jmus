package com.github.mustard.jmus;

import java.util.Scanner;

/**
 * @author Daniel
 */
public class Response {
    
    private String status;
    private String nowPlayingTitle;
    private String nowPlayingArtist;
    
    public static Response parse(String rawResponse) {
        if (rawResponse == null) {
            return null;
        }
        Scanner scanner = new Scanner(rawResponse);
        Response response = new Response();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("status")) {
                response.status = line.split(" ")[1];
            } else if (line.startsWith("tag artist")) {
                response.nowPlayingArtist = line.substring("tag artist".length() + 1, line.length());
            } else if (line.startsWith("tag title")) {
                response.nowPlayingTitle = line.substring("tag title".length() + 1, line.length());
            }
        }
        return response;
    }
    
    public String getStatus() {
        return status;
    }

    public String getNowPlayingTitle() {
        return nowPlayingTitle;
    }

    public String getNowPlayingArtist() {
        return nowPlayingArtist;
    }
    
}
