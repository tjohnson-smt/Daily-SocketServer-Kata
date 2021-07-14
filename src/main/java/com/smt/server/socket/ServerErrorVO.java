package com.smt.server.socket;

import java.io.OutputStream;
// Java 11
import java.util.HashMap;

/****************************************************************************
 * <b>Title:</b> ServerError.java
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

public class ServerErrorVO {

	private Integer errorCode;
	private static final HashMap<Integer, String> errorMessages = new HashMap<>();
	
	/**
	 * Construct the Server Error object.
	 */
	public ServerErrorVO() {
	}
	
	/**
	 * Construct the Server Error object with an error code.
	 * @param errorCode
	 */
	public ServerErrorVO(Integer errorCode) {
		this.setErrorCode(errorCode);
	}

	/**
	 * Returns the error code.
	 * @return
	 */
	public Integer getErrorCode() {
		return this.errorCode;
	}
	
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	
	/**
	 * Returns the error message for the stored code.
	 * @return
	 */
	public String getMessage() {
		return errorMessages.get(errorCode);
	}
	
	/**
	 * Streams back an error file.
	 */
	public void returnError() {
		// Stream an 'error file'
	}
}
