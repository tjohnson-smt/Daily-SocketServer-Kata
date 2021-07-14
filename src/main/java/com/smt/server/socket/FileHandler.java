package com.smt.server.socket;

/****************************************************************************
 * <b>Title:</b> FileHandler.java
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

public class FileHandler {
	
	private MimeType mimeType;
	private String fileName;
	private String filePath;

	/**
	 * Construct the File Handler object.
	 */
	public FileHandler() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Streams the file for the given name and path.
	 */
	public void returnFile() {
		// Stream the file
	}

	/**
	 * @return the mimeType
	 */
	public MimeType getMimeType() {
		return mimeType;
	}
	
	/**
	 * Build and set the Mime Type object from a String.
	 * 
	 * @param mimeType
	 */
	public void setMimeType(String mimeType) {
		// Build and set the mime type object
	}

	/**
	 * @param mimeType the mimeType to set
	 */
	public void setMimeType(MimeType mimeType) {
		this.mimeType = mimeType;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
