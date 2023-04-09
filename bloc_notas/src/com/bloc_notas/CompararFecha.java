package com.bloc_notas;

import java.util.Comparator;

public class CompararFecha implements Comparator<Nota> {

	public int compare(Nota blocNota, Nota blocNota1) {
	int resultado = 0;
		
		if(blocNota!=null && blocNota1!= null) {
			if(resultado == 0) {
				resultado=blocNota.getFechaCreacion().compareTo(blocNota1.getFechaCreacion());
			}
		}else if(blocNota==null ) {
			resultado = 1;
		}else if (blocNota1==null) {
			resultado = -1;
		}
		return resultado;
	}
		
}


