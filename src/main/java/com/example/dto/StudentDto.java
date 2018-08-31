package com.example.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentDto.
 */
public class StudentDto  implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The user name. */
	private String userName;
	
	/** The password. */
	private String password;
	
	/** The status. */
	private String status;
	
	/**
	 * Instantiates a new student dto.
	 *
	 * @param userName the user name
	 * @param password the password
	 * @param status the status
	 */
	public StudentDto(String userName, String password, String status) {
	    this.userName = userName;
	    this.password = password;
	    this.status = status;    	
    }

	/**
	 * Gets the user name.
	 *
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
}
