package org.rage.loan.exception;

public class RageDataException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public RageDataException(){
		super();
	}

	public RageDataException(String message){
		super(message);
	}
	
	public RageDataException(Throwable exception){
		super(exception);
	}
}
