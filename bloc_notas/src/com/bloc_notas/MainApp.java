package com.bloc_notas;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MainApp {


	public static void main(String[] args) {
		
		try {
			
			Nota nota = new Nota("Hola, me llamo Miguel Angel");
			Nota nota1 = new Nota("Hola, me llamo Ana Belen");
			System.out.println(nota.getFechaCreacion());
			System.out.println(nota.getCodigo());
			System.out.println(nota.isEmpy());
			System.out.println(nota1.getFechaCreacion());
			System.out.println(nota1.getCodigo());
			System.out.println(nota1.isEmpy());
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
