package introduccion_java_boletinIII;

public class ejercicio7 {

	/*
	 * 7. Realizar una función que busque una palabra escondida dentro de un texto. Por
ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”,
entonces si se encontrará y deberá devolver True, en caso contrario deberá devolver
False. Las letras de la palabra escondida deben aparecer en el orden correcto en la
cadena que la oculta:
	 */
	
	public static void main(String[] args) {
		
		System.out.println(escondida("shybaoxlna","hola"));

	}
	
	public static boolean escondida(String cadena, String palabra) {
	    int contador = 0;
	    
	    boolean mensaje = false;
	    for (int i = 0; i < cadena.length(); i++) {
	        if (cadena.charAt(i) == palabra.charAt(contador)) {
	            contador++;
	        }
	        if (contador == palabra.length()) {
	            mensaje= true;
	        }
	    }
	    return mensaje;
	}
}
