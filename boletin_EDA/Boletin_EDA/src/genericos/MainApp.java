package genericos;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		
		
		String[] nombres = {"Miguel", "Ana", "Juan"};
		String[] nombreInverso = reverse(nombres);
		
		System.out.println(Arrays.toString(nombres));
		System.out.println(Arrays.toString(nombreInverso));

	}
	
	protected static <T> T[] reverse ( T[] nombres) {
		T[] nombreInverso= nombres.clone();

		
		for(int i = nombres.length-1, j=0; i>=0; i--, j++) {
			nombreInverso[i]=nombres[j];
		}
		return nombreInverso;
	}
	

}
