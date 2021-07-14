package com.smt.server.socket;

// Lombok 1.x
import lombok.extern.log4j.Log4j2;

// Java 11
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;

/****************************************************************************
 * <b>Title:</b> RequestHandler.java
 * <b>Project:</b> Daily-SocketServer-Kata
 * <b>Description:</b> 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Tim Johnson
 * @version 3.0
 * @since Jul 12 2021
 * @updates:
 ****************************************************************************/
@Log4j2
public class RequestHandler implements Runnable{

    protected Socket clientSocket = null;
    protected String serverName = null;

    /**
     * Constructor for the request handler.
     * 
     * @param clientSocket
     * @param serverText
     */
    public RequestHandler(Socket clientSocket, String serverName) {
        this.clientSocket = clientSocket;
        this.serverName = serverName;
    }

    /**
     * Run the request handler thread.
     */
    public void run() {
        try {
        	// Initialize the streams.
            InputStream input  = clientSocket.getInputStream();
            OutputStream output = clientSocket.getOutputStream();
            
            // Write data to be output.
            long time = System.currentTimeMillis();
            output.write(("HTTP/1.1 200 OK\n\n" + this.serverName + " - " + time + "").getBytes());
            output.close();
            
            // Finish the request.
            input.close();
            log.info("Request processed: " + time);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
