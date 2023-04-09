package com.empresa;

public interface Backend {
	
	public static final double WEB_API_DB_COST = 0;
	public static final double BE_MAINTENANCE_COST = 0;
	

	public  double  createWebAPIAndDBConnection();
	
	public  double  maintenanceCost();

}
