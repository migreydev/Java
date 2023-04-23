package mosk_exam_euro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class MainApp {

	public static void main(String[] args) {

		Combinacion euroMillon = new Combinacion(new int[]{14,22,30,41,45}, new int[]{6,10});
		Historial historialEuroMillon = new Historial();
		
		try {
			
			historialEuroMillon.addSorteo(LocalDate.now(), euroMillon);
			System.out.println(euroMillon);
			
			//historialEuroMillon.comprobarAcierto(LocalDate.now(), euroMillon);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		

	}
	
}
