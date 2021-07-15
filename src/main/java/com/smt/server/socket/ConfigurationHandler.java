package com.smt.server.socket;

// Java 11
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import lombok.extern.log4j.Log4j2;

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
	
	private static HashMap<String, String> serverOptions;

	/**
	 * Configuration constructor.
	 */
	public ConfigurationHandler() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Loads the configuration from the file system into memory.
	 * @throws IOException 
	 */
	public static void loadConfig() throws IOException {
		// initialize hash map
		serverOptions = new HashMap<>();
		// Get config from file system
		Class<ConfigurationHandler> configurationHandler = ConfigurationHandler.class;
		InputStream inputStream = configurationHandler.getResourceAsStream("/Config/app.properties");
		InputStreamReader isReader = new InputStreamReader(inputStream);
	      //Creating a BufferedReader object
	      BufferedReader reader = new BufferedReader(isReader);
	      String str;
	      while((str = reader.readLine())!= null){
	    	  if (str.contains("=")) {
	    		 String[] config = str.split(" = ", 2);
	 	         serverOptions.put(config[0], config[1]);
	    	  }
	      }
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
