package com.github.mustard.jmus;

import com.github.mustard.jmus.command.Command;
import java.io.*;
import java.net.Socket;

/**
 * @author Daniel
 * 
 * TODO unit / integration tests... 
 */
public class CmusCommandDispatcher {

    private final CmusClient client;

    public CmusCommandDispatcher(CmusClient client) {
        this.client = client;
    }

    private void validAuth(BufferedReader in) throws IOException {
        String passAnswer = readAnswer(in);
        if (passAnswer != null && (! passAnswer.trim().isEmpty())) {
            throw new RuntimeException("Could not login: " + passAnswer);
        }
    }

    private String readAnswer(BufferedReader in) throws IOException {
        StringBuilder answerBuilder = new StringBuilder();

        String line;
        while ((line = in.readLine()) != null && line.length() != 0) {
            answerBuilder.append(line).append("\n");
        }

        return answerBuilder.toString();
    }

    private void handleCmdAnswer(BufferedReader in, final Command command) throws IOException {
        final String cmdAnswer = readAnswer(in);
        if (cmdAnswer != null && cmdAnswer.trim().length() != 0) {
            // TODO parse the answer 
        }
    }

    public void dispatch(Command command) throws IOException {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            socket = new Socket(client.getHost(), client.getPort());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()), Character.SIZE);
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("passwd " + client.getPassword());
            validAuth(in);
            out.println(command.getCommand());
            handleCmdAnswer(in, command);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e1) {
                }
                in = null;
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e1) {
                }
                out = null;
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                }
                socket = null;
            }
        }
    }
}
