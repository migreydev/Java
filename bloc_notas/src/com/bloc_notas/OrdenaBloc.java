package com.bloc_notas;

import java.util.Comparator;

public class OrdenaBloc implements Comparator<Bloc> {

	@Override
	public int compare(Bloc blocNota, Bloc blocNota1) {
		
		int resultado=0;
		
		if(blocNota != null && blocNota1 != null) {
			if(resultado==0) {
				resultado=blocNota.getNombre().compareTo(blocNota1.getNombre());
			}
		}else if(blocNota == null) {
			resultado = 1;
		}else if (blocNota1 == null) {
			resultado=1;
		}
		return resultado;
	}
}
