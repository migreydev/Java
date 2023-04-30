package granAlmacen;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
    private boolean abierta;
    private int numero;
    private List<Integer> clientesEsperando;

    public Caja(int numero) {
    	super();
    	this.numero=numero;
        this.abierta = false; 
    }
    
    public boolean abrir() throws ExceptionCaja{
    	boolean mensaje = false;
    	
        if(this.abierta) {
        	mensaje=true;
        } else {
           throw new ExceptionCaja("La caja no se encuentra abierta");
        }
        return mensaje;
    }
    
    public boolean estaAbierta() {
        return abierta;
    }
    
    public boolean cerrar() throws ExceptionCaja{
    	boolean mensaje = false;
    	
        if (!this.abierta) {
        	mensaje=true;
        } else {
           throw new ExceptionCaja("La caja no se encuentra cerrada");
        }
        return mensaje;
    }
    
   

}