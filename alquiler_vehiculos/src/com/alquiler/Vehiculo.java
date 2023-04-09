package com.alquiler;

public class Vehiculo {
	
	private String matricula;
	private Combustible combustible;
	private Gama gama;
	
	

	public Vehiculo(String matricula, Combustible comustible, Gama gama) throws Excepcion {
		super();
		this.matricula=matricula;
		
		if(this.matricula.length() > 8) {
			throw new Excepcion("La matricula excede la longitud permitida ");
		}
		int contadorNum = 0;
		int contadorLet=0;

		for(int i=0; i<this.matricula.length(); i++) {
			char c= matricula.charAt(i);
			if(Character.isDigit(c)) {
				contadorNum++;
				if(contadorNum==4) {
				}
			}else if(Character.isLetter(c)) {
				contadorLet++;
				if(contadorLet==3) {
				}
			}
		}
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public void setCombustible(Combustible combustibleEnum) {
		 this.combustible = combustible;
		
	}
	
	public void setGama(Gama gama) {
	    this.gama = gama;
	}
	
	

	

}
