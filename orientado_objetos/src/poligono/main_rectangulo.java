package poligono;

import java.util.Scanner;

public class main_rectangulo {

	public static void main(String[] args) {
		
		System.out.println("Introduce la base del rectangulo");
		Scanner sc = new Scanner (System.in);
		double longitud = Double.valueOf(sc.nextLine());
		
		System.out.println("Introduce el ancho del rectangulo");
		double ancho = Double.valueOf(sc.nextLine());
		
		Rectangulo rectangulo = new Rectangulo(ancho,longitud);
		System.out.println(rectangulo);
		
		System.out.println(rectangulo);
	}
}

