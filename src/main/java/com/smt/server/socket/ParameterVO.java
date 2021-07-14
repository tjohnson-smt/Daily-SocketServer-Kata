package com.smt.server.socket;

// Java 11
import java.util.List;

/****************************************************************************
 * <b>Title:</b> ParameterVO.java
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

public class ParameterVO {
	
	private String key;
	private List<String> value;

	/**
	 * Construct an empty Parameter
	 */
	public ParameterVO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Construct a Parameter with key and value.
	 * 
	 * @param key
	 * @param value
	 */
	public ParameterVO(String key, List<String> value) {
		this.setKey(key);
		this.setValue(value);
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public List<String> getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(List<String> value) {
		this.value = value;
	}
	
	/**
	 * Add a value into the value array.
	 * @param value
	 */
	public void addValue(String value) {
		this.value.add(value);
	}
}
