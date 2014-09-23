package org.rage.loan.model;

import java.io.Serializable;

public enum LoanType implements Serializable {
	MONEY(1),
	PRODUCT(2);
	
	Integer type;
	
	LoanType(Integer type){
		this.type = type;
	}
}
