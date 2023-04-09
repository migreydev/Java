package com.bloc_notas;

import java.util.Objects;

public class Bloc {

	private static final int NUMERO_NOTAS_MAXIMA = 5;
	private int numNotas;
	private String nombre;
	
	private Nota nota;

	public Bloc(String nombre) {
		super();
		this.nombre=nombre;

	}

	public Nota getNota() {
		return nota;
	}
	
	public void updateNota(int numNota, String nombre) {
		if(this.numNotas >=0 && this.numNotas < this.NUMERO_NOTAS_MAXIMA) {
			nota.setTexto(nombre);
		}
	}
	
	
	public void activar() throws BlocExcepcion {
		throw new BlocExcepcion("El Bloc está activo");
		
	}
	
	public void desactivar() throws BlocExcepcion {
		throw new BlocExcepcion("El Bloc está desactivado");
	}

	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s\n"
							+ "Numero de notas: %s\n",		
				getClass().getSimpleName(), this.nombre, this.numNotas);
	}
	
	
	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Bloc) {
			Bloc casteado = (Bloc) obj;
			sonIguales = this.nombre.equals(casteado.nombre);
		}
		return sonIguales;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, nota, numNotas);
	}
	
	public String ordenaBloc() {
		
		return "";

	}


}
