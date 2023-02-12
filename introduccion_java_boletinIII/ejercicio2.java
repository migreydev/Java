package introduccion_java_boletinIII;

public class ejercicio2 {
	
	/*
	 * 2. Un número es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es
igual a 0, 3, 6 ó 9.
Por ejemplo, 156 ⇒ 1+5+6=12 ⇒ 1+2 = 3 es divisible,
pero 157 ⇒ 1+5+7 =13 ⇒ 1+3 =4 no lo es.
Elabora un programa que compruebe la divisibilidad por 3 según este algoritmo. El
programa debe comprobar que el número facilitado es válido.
	 */

	public static void main(String[] args) {
	
		
		System.out.println(divisible(156));
	
	}

	public static boolean divisible(int numero) {

		int suma=0;
		boolean mensaje=false;
		
		String numeroCadena=String.valueOf(numero);
		
		
		for(int i= 0; i<numeroCadena.length();i++) {
			int numeroDigito= Character.getNumericValue(numeroCadena.charAt(i));
			suma+= numeroDigito;
			
			if (numeroDigito%3==0) {
				mensaje=true;
			}else {
				mensaje=false;
			}
		}
		return mensaje;
	}
}
	

