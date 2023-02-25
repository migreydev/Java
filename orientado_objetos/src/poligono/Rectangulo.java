package poligono;

public class Rectangulo {

	private double longitud;
	private double ancho;
	
	public Rectangulo() {
		this.ancho=1;
		this.longitud=1;
	}
	
	public Rectangulo(double longitud, double ancho) {
		this();
		setLongitud(longitud);
		setAncho(ancho);
	}
	
	public double calcularPerimetro() {
		double perimetro = 2*(this.ancho + this.longitud);
		
		return perimetro;
	}
	
	public double calcularAreaRecangulo() {
		double area = this.longitud * this.ancho;
		
		return area;
	}
	
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
	
		if(longitud>0 && longitud<20) {
			this.longitud = longitud;
		}
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		
		if(ancho>0 && ancho<20) {
			this.ancho = ancho;
		}
	}

	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + ", calcularPerimetro()=" + calcularPerimetro()
				+ ", calcularAreaRecangulo()=" + calcularAreaRecangulo() + "]";
	}
}
