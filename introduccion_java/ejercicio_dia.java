package com.edu;

public class ejercicio_dia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int agnio = 2022;
		int mes = 1;
		
		switch (mes) {
			case 1,3,5,7,8,10,12: {
				System.out.println("Tiene 31 días");
				break;
			} case 4, 6, 9, 11 :{
				System.out.println("Tiene 30 días");
				break;
			} case 2: {
				if (agnio%4==0 && (agnio%100!=0 || agnio%400==0)) {
					System.out.println("Tiene 29 días");
			} else {
				System.out.println("Tiene 28 días");
				
			}
			break;
		}

	}

}
	
}
