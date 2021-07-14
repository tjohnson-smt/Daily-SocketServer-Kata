package com.smt.server.socket;

// Lombok 1.x
import lombok.extern.log4j.Log4j2;

// Java 11
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;

/****************************************************************************
 * <b>Title</b>: SMTWebServer.java
 * <b>Project</b>: Daily-SocketServer-Kata
 * <b>Description: </b> Socket Server Kata
 * This class is the main entry point into your server
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 28, 2021
 * @updates:
 ****************************************************************************/
@Log4j2
public class SMTWebServer implements Runnable {
	
    protected static int serverPort = 8080; // default port
    protected boolean isStopped = false;
    protected ServerSocket serverSocket = null;
    protected Thread runningThread = null;

    /**
     * Web server constructor, with initialization.
     * @param port
     */
    public SMTWebServer(int port) {
        serverPort = port;
    }
    
	/**
	 * Kick off the threaded server.
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialize the server.
		SMTWebServer webServer = new SMTWebServer(8081);
		new Thread(webServer).start();

		// Run the server.
		try {
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Stop the server.
		log.info("Stopping SMT Web Server");
		webServer.stop();
	}
    
	/**
	 * Runs the server main thread.
	 */
    public void run() {
    	// Get the currently running thread.
        synchronized(this) {
            this.runningThread = Thread.currentThread();
        }
        
        // Open the server port.
        openServerSocket();
        
        // Listen for connection requests.
        while (!isStopped()) {
            Socket clientSocket = null;
            
            try {
                clientSocket = this.serverSocket.accept();
            } catch (IOException e) {
                if (isStopped()) {
                    log.info("Stopped the SMT Web Server (Stop Was Called)") ;
                    return;
                }
                
                throw new RuntimeException("Error accepting client connection", e);
            }
            
            // Start a new thread with the connection request.
            new Thread(new RequestHandler(clientSocket, "SMT Web Server")).start();
        }
        
        log.info("Stopped the SMT Web Server (End of Thread Runner)") ;
    }

    /**
     * Start listening on the configured port.
     */
    private void openServerSocket() {
        try {
            this.serverSocket = new ServerSocket(serverPort);
            log.info("SMT Web Server is Listening on Port " + serverPort);
			log.info("Press the Enter Key to Stop");
        } catch (IOException e) {
            throw new RuntimeException("Cannot open port " + serverPort, e);
        }
    }

    /**
     * Stop the server.
     */
    public synchronized void stop() {
        this.isStopped = true;
        
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException("Error closing server", e);
        }
    }

    /**
     * Returns the status of the server.
     * @return
     */
    public synchronized boolean isStopped() {
        return this.isStopped;
    }
}
