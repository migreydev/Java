package granAlmacen;

import java.util.ArrayList;
import java.util.List;

public class GranAlmacen {
    
    private static final int NUM_CAJAS = 20;
    
    private List<Caja> cajas;
    private List<Cliente> clientes;
    
    public GranAlmacen() {
        cajas = new ArrayList<>();
        for (int i = 0; i<= NUM_CAJAS; i++) {
            cajas.add(new Caja(i));
        }
        clientes = new ArrayList<>();
    }

	public static int getNumCajas() {
		return NUM_CAJAS;
	}

	public List<Caja> getCajas() {
		return cajas;
	}

	

}
