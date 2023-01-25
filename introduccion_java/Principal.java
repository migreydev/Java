package com.edu;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
	
		int edad = 0;
		
		System.out.println("Indique tu edad ");
		Scanner sc= new Scanner(System.in);
		edad= Integer.valueOf(sc.nextLine());
		
		if (edad < 18 ) {
			System.out.println("Eres niñ@ ");
		}else if (18 < edad && edad < 65) {
			System.out.println("Eres adulto ");
		}else {
			System.out.println("Eres ancian@ ");
		}
	}

}