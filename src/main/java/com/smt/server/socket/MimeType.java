package com.smt.server.socket;

// Java 11
import java.util.HashMap;

/****************************************************************************
 * <b>Title:</b> MimeType.java
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

public class MimeType {
	
	private String mimeType;
	private static final HashMap<String, String> mimeTypes = new HashMap<>();

	/**
	 * Construct the Mime Type object.
	 */
	public MimeType() {
	}
	
	/**
	 * Construct the Mime Type object with the passed value.
	 * @param mimeType
	 */
	public MimeType(String mimeType) {
		this.setMimeType(mimeType);
	}
	
	/**
	 * Return the configured Mime Type.
	 * @return
	 */
	public String getMimeType() {
		return mimeType;
	}
	
	/**
	 * Sets the Mime Type value.
	 * @param mimeType
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * Returns the user readable 'friendly' name of the Mime Type.
	 * 
	 * @param mimeType
	 * @return
	 */
	public String getMimeTypeName() {
		return mimeTypes.get(this.mimeType);
	}
}
