package juego_cartas;

import java.util.Random;

public class Baraja {
	
	private int numCartas;
	private int siguiente;
	
	private Carta[] cartas;
	
	private static final int MAX_SIZE = 40;

	
	public Baraja() throws Exception {
		super();
		this.cartas = new Carta[MAX_SIZE];
		this.siguiente=0;
		
		for(Palo p: Palo.values()) {
			for(int i=1; i <13; i++) {
				if(i!=8 && i!=9) {
					this.cartas[this.siguiente++]= new Carta(i, p);
				}
			}
		}
		
		String[] nombres = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo", "Rey"};
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        
        //Cartas numericas del 2 al 7 = Tienen el mismo valor de la carta
        //As = 1 punto
        //REY, CABALLO Y SOTA = medio punto

	}
	
	public void barajar() {
		Random rand = new Random();
		 for (int i = 0; i < cartas.length; i++) {
		        int randomIndex = rand.nextInt(cartas.length);
		        Carta temp = cartas[i];
		        cartas[i] = cartas[randomIndex];
		        cartas[randomIndex] = temp;
		    }
	}

	@Override
	public String toString() {
		return "Baraja [numCartas=" + numCartas + ", siguiente=" + siguiente + "]";
	}
	
}



