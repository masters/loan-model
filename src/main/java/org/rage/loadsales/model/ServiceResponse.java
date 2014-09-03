package org.rage.loadsales.model;

import java.io.Serializable;

public class ServiceResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean valid;
	private String errorMessage;
	private String sucessMessage;
	
	public ServiceResponse(){
		this.valid = Boolean.TRUE;
	}
	
	public ServiceResponse(boolean valid, String errorMessage){
		this.valid = valid;
		this.errorMessage = errorMessage;
	}

	public ServiceResponse(boolean valid, String errorMessage, String sucessMessage){
		this.valid = valid;
		this.errorMessage = errorMessage;
		this.sucessMessage = sucessMessage;
	}
	
	public static ServiceResponse newInstance(){
		return new ServiceResponse();
	}
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getSucessMessage() {
		return sucessMessage;
	}

	public void setSucessMessage(String sucessMessage) {
		this.sucessMessage = sucessMessage;
	}
	
	
}
