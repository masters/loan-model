package org.rage.loadsales.model;

import java.io.Serializable;

public enum PayType implements Serializable{
	BANK(1), CASH(2);
	
	Integer type;
	
	PayType(Integer type){
		this.type = type;
	}
}
