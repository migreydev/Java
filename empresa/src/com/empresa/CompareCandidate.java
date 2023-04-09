package com.empresa;

import java.util.Comparator;

public class CompareCandidate implements Comparator<Candidate> {

	@Override
	public int compare(Candidate o1, Candidate o2) {
		int resultado=0;
		
		
		if(o1!=null && o2!=null) {
			if(resultado ==0) {
				resultado = o1.getStarDate().compareTo(o2.getStarDate());
			}
		}else if (o1==null) {
			resultado = 1;
		}else if (o2==null) {
			resultado = -1;
		}
		return resultado;
	}

}
