package maquina_cafe;

public class Maquina {

	//Atributo de la clase Maquina
	
	// Declaramos el precio de cada bebida como CONSTANTE ya que esta siempre mostrara ese mismo valor
	public static final  double  CAFE=1.00;
	public static final  double  LECHE=0.80;
	public static final  double  CAFECONLECHE=1.50;
	
	private double monedero;
	private int dosisCafe;
	private int dosisLeche;
	private int vasos;
	
	
	//Constructor
	public Maquina(double monedero) {
		this.monedero = monedero;
		this.dosisCafe=50;
		this.dosisLeche=50;
		this.vasos=80;
	}

	//METODOS
	
	//Metodo para llenar depositos
	
	public void llenarDepositos (int cantidad) {
		this.dosisCafe=50;
		this.dosisLeche=50;
		this.vasos=80;
	}
	
	//Metodo para vaciar monedero
	
	public void vaciarMonedero() {
		this.monedero = 0;
	}
	
	
	//Metodo para servir cafe solo, leche o cafe con leche
	
	public String servirCafe(double dineroIntroducir) {
		String mensaje ="";
		
		if(this.dosisCafe < 1 && this.vasos < 1) {
			mensaje+="No se puede servir el café ya que no se dispone de existencias ";
			
		}else if(this.monedero < CAFE ) {
			mensaje+="Dinero insuficiente. Introduce al menos 1 euro";
			
		}else {
			this.monedero-=CAFE;
			this.dosisCafe--;
			this.vasos--;
		}
		
		return mensaje;
	}
	
	public String servirLeche(double dineroIntroducir) {
		String mensaje ="";
		
		if(this.dosisLeche < 1 && this.vasos < 1) {
			mensaje+="No se puede servir la leche ya que no se dispone de existencias ";
			
		}else if(this.monedero < LECHE ) {
			mensaje+="Dinero insuficiente. Introduce al menos 0.80 centimos ";
			
		}else {
			this.monedero-=LECHE;
			this.dosisLeche--;
			this.vasos--;
		}
		
		return mensaje;
	}
	
	public String servirCafeConLeche(double dineroIntroducir) {
		String mensaje ="";
		
		if(this.dosisCafe < 1 && this.dosisLeche<1 && this.vasos < 1) {
			mensaje+="No se puede servir el cafe con leche ya que no se dispone de existencias ";
			
		}else if(this.monedero < CAFECONLECHE ) {
			mensaje+="Dinero insuficiente. Introduce al menos 1.50 euro";
			
		}else {
			this.monedero-=CAFECONLECHE;
			this.dosisCafe--;
			this.dosisLeche--;
			this.vasos--;
		}
		return mensaje;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Maquina [monedero=" + monedero + ", dosisCafe=" + dosisCafe + ", dosisLeche=" + dosisLeche + ", vasos="
				+ vasos + "]";
	}
}
