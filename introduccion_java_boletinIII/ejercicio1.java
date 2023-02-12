package introduccion_java_boletinIII;

public class ejercicio1 {

	/*
	 * 1. Escribe una función que reciba una cadena de texto y una variable bandera
(par/impar) e imprima solo los caracteres que se encuentran situados en las
posiciones pares o impares (según indique la variable bandera).
Desarrolla el código con un bucle for y después modifica el código para que utilice
una estructura while y do-while.
	 */
	
	public static void main(String[] args) {
		
		String cadena = "miguel";
		String bandera="impar";
		
		System.out.println(caracteresPosicion(cadena,bandera));	
	}
	
	public static String caracteresPosicion(String cadena, String bandera) {
		String variable="";
		
		if (cadena!=null && !cadena.isEmpty() && bandera!=null && bandera.equals("par") || bandera.equals("impar")) {
			for(int i=0; i<cadena.length(); i++) {
				if(i%2==1 && bandera.equals("par")) {
					variable+=cadena.charAt(i);
					
				}else {
					if(i%2==0 && bandera.equals("impar")) {
						variable+=cadena.charAt(i);
					}
				}
			
			}
		}
		return variable;
	}

}
