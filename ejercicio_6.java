package com.edu;

import java.util.Scanner;


/*
6. Programar un sistema de calefacción-refrigeración que compruebe en función del
día y el mes, la estación en la que estamos y dependiendo de la estación programe
la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
El método deberá recibir como parámetro el mes y el día actual y devolver los
grados a los que deberemos programar el sistema
*/

public class ejercicio_6 {

	public static void main(String[] args) {
		
		int dia =0;
		int mes =0;
		int agnio=0;
		
		System.out.println("Indique el dia");
		Scanner sc= new Scanner(System.in);
		dia= Integer.valueOf(sc.nextLine());
		
		System.out.println("Indique el mes");
		Scanner sc1= new Scanner(System.in);
		mes= Integer.valueOf(sc1.nextLine());
		
		if ((dia>0 && dia<=31) && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)) {
			if ((dia>0 && dia<=31) && (mes==1 || mes==3 || mes==12)) {
				System.out.println("La calefaccion esta a 19º");
			}else if ((dia>0 && dia<31) && (mes==5)) {
				System.out.println("La calefaccionesta a 20º");
			}else if ((dia>0 && dia<31) && (mes==7 || mes==8)) {
				System.out.println("La refrigeracion esta a 24º");
			}else if ((dia>0 && dia<31) && (mes==10)) {
				System.out.println("La cafefaccion esta a 19");
			}
		}else if ((dia>0 && dia<=30) && (mes==4 || mes==6 || mes==9 || mes==11)) {
			if ((dia>0 && dia<=30) && (mes==4)) {
				System.out.println("La calefaccion esta a 20º");
			}else if ((dia>0 && dia<=30) && (mes==6 || mes==9)) {
				System.out.println("La refrigeracion esta a 24º");
			}else if ((dia>0 && dia<=30) && (mes==11)) {
				System.out.println("La calefaccion esta a 19º");
			}
		}else if ((agnio%4==0 && mes==2) && (agnio%100!=0 || agnio%400==0)) {
			System.out.println("La cafefaccion esta a 19");
		}else if ((dia>0 && dia<=28) && (mes==2)) {
			System.out.println("La cafefaccion esta a 19");
		}
	}
}
