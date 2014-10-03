package org.rage.loan.model;

import java.io.Serializable;

public class Credential implements Serializable{

	private static final long serialVersionUID = 1L;
	private String personId;
	private String password;
	
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
