package com.smt.server.socket;

import java.util.List;

/****************************************************************************
 * <b>Title:</b> ResponseHandler.java
 * <b>Project:</b> Daily-SocketServer-Kata
 * <b>Description:</b> 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Tim Johnson
 * @version 3.0
 * @since Jul 14 2021
 * @updates:
 ****************************************************************************/

public class ResponseHandler {
	
    private List<ParameterVO> headers;
    private ServerErrorVO error;
    private FileHandler file;

	/**
	 * Construct a new Response Handler object.
	 */
	public ResponseHandler() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Generates the headers required by the response.
	 */
	private void generateHeaders() {
		
	}
	
	/**
	 * Initialize the stream, compression library, base64 encoding, etc.
	 */
	private void prepareResponse() {
		
	}
	
	/**
	 * Stream the response data.
	 */
	private void sendResponse() {
		
	}
}
