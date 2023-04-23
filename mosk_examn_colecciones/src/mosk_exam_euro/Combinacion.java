package mosk_exam_euro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;


public class Combinacion {

	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUMEROS = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;
	 
	private Set<Integer>numeros;
	private Set<Integer>estrellas;
	
	public Combinacion(int numero1, int numero2, int numero3, int numero4, int numero5, int estrella1, int estrella2) {
		super();
		this.numeros = new HashSet<>();
        this.estrellas = new HashSet<>();

        this.numeros.add(numero1);
        this.numeros.add(numero2);
        this.numeros.add(numero3);
        this.numeros.add(numero4);
        this.numeros.add(numero5);

        this.estrellas.add(estrella1);
        this.estrellas.add(estrella2);
    }
	
	  public Combinacion(int[] numeros, int[] estrellas) {
		  	super();
	        this.numeros = new HashSet<>();
	        this.estrellas = new HashSet<>();

	        for (int numero : numeros) {
	            this.numeros.add(numero);
	        }

	        for (int estrella : estrellas) {
	            this.estrellas.add(estrella);
	        }
	    }

	public Collection<Integer> getNumeros() {
		return numeros;
	}

	public Collection<Integer> getEstrellas() {
		return estrellas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}
	
	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Combinacion) {
			Combinacion casteado = (Combinacion) obj;
			sonIguales = this.equals(casteado);
		}
		return sonIguales;
	}

	public String toString() {
		return String.format("El valor obtenido de numeros es el: %s\n"
								+ "El valor de las estrellas obtenidas es el:  %s\n",
								this.numeros, this.estrellas);
	}
	
	

}
