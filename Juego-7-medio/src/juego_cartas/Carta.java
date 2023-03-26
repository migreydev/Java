package juego_cartas;

import java.util.Objects;

public class Carta {

	private int number;
	private Palo palo;
	
	public Carta(int number, Palo palo) {
		super();
		this.number = number;
		this.palo = palo;
	}
	
	public double getValor() {
		return this.number>7? 0.5: this.number;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}
		
	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Carta) {
			Carta casteado = (Carta) obj;
			sonIguales = this.hashCode()==casteado.hashCode();
		}
		return sonIguales;
	}
	
	public int getNumber() {
		return number;
	}

	public Palo getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return this.number+" "+this.palo;
	}

}
