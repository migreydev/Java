package saldo_cuenta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(0, 0, 0);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Menu");
		System.out.println("1.Hacer un reintegro ");
		System.out.println("2.Hacer un ingreso ");
		System.out.println("3.Consultar el saldo y el número de reintegros e ingresos realizados ");
		System.out.println("4.Salir ");
		int opcion= 0;
		
		while (opcion != 4) {
			
			System.out.println("Introduce una opcion ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
				case 1:
					System.out.println("¿Que cantidad deseas retirar? ");
					double retirarReintegro = sc.nextDouble();
					cuenta.hacerReintegro(retirarReintegro);
					break;
				case 2:
					System.out.println("¿Que cantidad deseas ingresar? ");
					double realizarIngreso = sc.nextDouble();
					cuenta.hacerIngreso(realizarIngreso);
					break;
				case 3:
					System.out.println("Saldo actual: " + cuenta.getSaldo());
					System.out.println("Número de reintegros realizados: " + cuenta.getNumReintegro());
					System.out.println("Número de ingresos realizados: " + cuenta.getNumIngreso());
					break;
			}
			System.out.println("Tu saldo actual es de: " + cuenta.getSaldo());
		}
	}
}
