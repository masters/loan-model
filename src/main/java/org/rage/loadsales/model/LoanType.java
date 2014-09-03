package org.rage.loadsales.model;

import java.io.Serializable;

public enum LoanType implements Serializable {
	MONEY(1),
	PRODUCT(2);
	
	Integer type;
	
	LoanType(Integer type){
		this.type = type;
	}
}
