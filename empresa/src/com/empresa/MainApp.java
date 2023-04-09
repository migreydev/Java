package com.empresa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class MainApp {
	

	public static boolean altaEmpleado(Candidate candidate, Candidate[] candidates) {
		boolean mensaje=false;
		for(int i = 0; i<candidates.length; i++) {
			if(candidates[i] == null) {
				candidates[i] = candidate;
				mensaje=true;
			}
				
		}
		return mensaje;
	}
	
	public static void empleadoDNI(String dni, Candidate[] candidates) {
		for(Candidate candidate: candidates) {
			if(candidate !=null && candidate.getDni().equals(dni)) {
			}
		}
	}
	
	public static double showPrice(boolean maintenance, boolean partialContract, boolean back, Candidate candidate) {
	    double coste = 0.0;
	    double costeBase = 0.0;
	    
	    if(maintenance) {
	        if(back) {
	        	costeBase = 500.0;
	        } else {
	        	costeBase = 700.0;
	        }
	    }else {
	        if(back) {
	        	costeBase = 2200.0;
	        } else{
	        	costeBase = 2100.0;
	        }
	    }

	    if(partialContract) {
	        coste = costeBase * 0.33;
	    } else {
	        coste = costeBase;
	    }
	    
	    double incrementoExperiencia = candidate.EXPERIENCIA_PROFESIONAL * 0.05;
	    coste= costeBase * incrementoExperiencia;
	    
	    return coste;
	}
	
	
	public static void main(String[] args) {
		
		Candidate[] trabajadores = new Candidate[3];
		BackendProgrammer bk = new BackendProgrammer();
		bk.setDni("5566778E");
		bk.setStarDate(LocalDateTime.of(2023, 2, 19, 9, 0));
		
		WebDesigner wd = new WebDesigner();
		wd.setDni("4566778E");
		wd.setStarDate(LocalDateTime.of(2022, 2, 19, 9, 0));
		
		FullStackDeveloper fd = new FullStackDeveloper();
		fd.setDni("3566778E");
		fd.setStarDate(LocalDateTime.of(2021, 2, 19, 9, 0));	
		
		trabajadores[0]=bk;
		trabajadores[1]=wd;
		trabajadores[2]=fd;
		
		altaEmpleado(bk, trabajadores);
		altaEmpleado(wd, trabajadores);
		altaEmpleado(fd, trabajadores);
		
		Arrays.sort(trabajadores);
		
		System.out.println(trabajadores);
		
	}
	
}


