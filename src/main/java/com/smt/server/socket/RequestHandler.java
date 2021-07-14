package com.smt.server.socket;

// Lombok 1.x
import lombok.extern.log4j.Log4j2;

// Java 11
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

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

    private Socket clientSocket;
    private String serverName;
    private List<ParameterVO> headers;
    private List<ParameterVO> params;
    private FileHandler returnFile;
    private byte[] reqData;

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
    
    /**
     * Loads the request data.
     */
    private void loadData() {
    	
    }
    
    /**
     * Parses the headers out of the request data into the headers list.
     */
    private void parseHeaders() {
    	
    }
    
    /**
     * Get the file name requested by the request, and set the file object.
     */
    private void parseFile() {
    	
    }
    
    /**
     * Parses the parameters out of the request data into the parameters list.
     */
    private void parseParameters() {
    	
    }
    
    /**
     * Sets an error object when an error occurs.
     */
    private void setError() {
    	
    }
}
