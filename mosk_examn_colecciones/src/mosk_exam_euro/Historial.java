package mosk_exam_euro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {
	
	private Map<LocalDate, Combinacion> sorteos; 
	private LocalDate fecha;

	
	public Historial() {
		this.sorteos = new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fecha, Combinacion combinacion) throws HistorialExcepcion{
		boolean mensaje = false;
		
		if(sorteos.containsKey(fecha)) {
			throw new HistorialExcepcion ("Ya hay un sorteo en esta fecha");
		}else {
			sorteos.put(fecha, combinacion);
			mensaje=true;
		}
		return mensaje;
	}
	
	public boolean addSorteo(int dia,int mes ,int agno,Combinacion combinacion) throws HistorialExcepcion{
		boolean mensaje = false;
		if(dia < 0 || dia >31 && mes < 1 || mes >12) {
			throw new HistorialExcepcion ("La fecha introducida es erronea");
		}else {
			LocalDate fechaLocal = LocalDate.of(dia, mes, agno);
			sorteos.put(fechaLocal, combinacion);
			mensaje = true;
		}
		return mensaje;
	}
	
	public boolean actualizarSorteo(int dia, int mes, int agno, Combinacion combinacion) throws HistorialExcepcion{
		boolean mensaje = false;
		
		if(dia < 0 || dia >31 && mes < 1 || mes >12) {
			throw new HistorialExcepcion ("La fecha introducida es erronea");
		}else {
			LocalDate fechaLocal = LocalDate.of(dia, mes, agno);
			
			for(Map.Entry<LocalDate, Combinacion> historial : sorteos.entrySet()) {
			LocalDate fecha= historial.getKey();
			String fechaString = fecha.toString();
			
			Combinacion historicoCombinacion = historial.getValue();
			String combinacionString = historicoCombinacion.toString();
			
				if(fecha.equals(fechaLocal)) {
					sorteos.put(fechaLocal, combinacion);
					mensaje=true;
					
				}else {
					throw new HistorialExcepcion ("La fecha es erroena");
				}
			}
		}
		return mensaje;
	}
	
	public boolean actualizarSorteo(Map<LocalDate, Combinacion> sorteos) throws HistorialExcepcion{
		boolean mensaje = false;
		
		for(Map.Entry<LocalDate, Combinacion> historial : sorteos.entrySet()) {
			LocalDate fechaHistorico = historial.getKey();
			String fechaHisString = fechaHistorico.toString();
			
			Combinacion combinacion = historial.getValue();
			String combinacionString = combinacion.toString();
			
			if(sorteos.containsKey(fechaHistorico)) {
				sorteos.put(fechaHistorico, combinacion);
				
			}else {
				throw new HistorialExcepcion ("No esta registrada la fecha");
			}
		}
		return mensaje;
	}
	
	public boolean borrarSorteo(LocalDate fecha) throws HistorialExcepcion{
		boolean mensaje = false;
		
		if(sorteos.containsKey(fecha)) {
			sorteos.remove(fecha);
			mensaje = true;
		}else {
			throw new HistorialExcepcion ("No esta registrada la fecha");
		}
		return mensaje;
	}
	
	public boolean listarSorteosDesdeFecha(LocalDate fecha) throws HistorialExcepcion {
		boolean mensaje = false;
		
		for(LocalDate listar: sorteos.keySet()) {
			if(listar.equals(fecha) || listar.isAfter(fecha)) {
				mensaje = true;
			}else {
				throw new HistorialExcepcion ("No ha sido posible listar la fecha");
			}
		}
		return mensaje;
	}
	
	public List<String> mostrarHistorico() {
		List<String> historico = new ArrayList<>();
		for(Map.Entry<LocalDate, Combinacion> historial : sorteos.entrySet()) {
			LocalDate fechaHistorico = historial.getKey();
			String fechaHisString = fechaHistorico.toString();
			
			Combinacion historicoCombinacion = historial.getValue();
			String combinacionString = historicoCombinacion.toString();
			historico.add(fechaHisString);
			historico.add(combinacionString);
		}
		return historico;
	}
	
	public Map<String, Integer> comprobarAcierto(Map<LocalDate, Combinacion> sorteos, Combinacion combinacion) {
	    Map<String, Integer> aciertos = new HashMap<>();
	    for (Map.Entry<LocalDate, Combinacion> sorteo : sorteos.entrySet()) {
	        int contadorAcierto = 0;
	        Combinacion numerosGanadores = sorteo.getValue();
	        if (numerosGanadores.equals(combinacion)) {
	            if(contadorAcierto == 7) {
	            	String fecha = sorteo.getKey().toString();
	            	aciertos.put(fecha,contadorAcierto);
	            }
	        }
	    }
	    return aciertos;
	}



}
