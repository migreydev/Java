package com.empresa;

public enum ContractType {
	
		
	FULLTIME, PARTIAL;
		
	private ContractType() {	
		
	}

	public static ContractType getFulltime() {
		return FULLTIME;
	}

	public static ContractType getPartial() {
		return PARTIAL;
	}

}

