package com.smt.server.socket;

// Java 11
import java.util.HashMap;

/****************************************************************************
 * <b>Title:</b> Configuration.java
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

public class ConfigurationHandler {
	
	private HashMap<String, String> serverOptions;

	/**
	 * Configuration constructor.
	 */
	public ConfigurationHandler() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Loads the configuration from the file system into memory.
	 */
	public void loadConfig() {
		// Get config from file system
		
		// Load config to map
	}
	
	/**
	 * Returns the requested configuration option value.
	 * 
	 * @return
	 */
	public String getConfig(String configKey) {
		// Do something if key doesn't exist
		
		return serverOptions.get(configKey);
	}

	/**
	 * Set the specified configuration value.
	 */
	public void setConfig(String configKey, String configValue) {
		serverOptions.put(configKey, configValue);
	}
}
