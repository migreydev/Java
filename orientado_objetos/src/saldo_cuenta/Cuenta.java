package saldo_cuenta;

public class Cuenta {

	private double reintegro;
	private double ingreso;
	private double saldo;
	private int numReintegro;
	private int numIngreso;
	
	
	public Cuenta(double reintegro, double ingreso, double saldo) {
		super();
		this.reintegro=reintegro;
		this.ingreso=ingreso;
		this.saldo=saldo;
		this.numReintegro =0;
		this.numIngreso=0;
	}
	
	public void hacerReintegro(double cantidad) {

		if(saldo >= cantidad) {
			saldo-=cantidad;
			numReintegro++;
		}
	}
	
	public void hacerIngreso(double cantidad) {
		saldo+=cantidad;
		numIngreso++;
	}
	
	public double getReintegro() {
		return reintegro;
	}

	public void setReintegro(double reintegro) {
		this.reintegro = reintegro;
	}

	public double getIngreso() {
		return ingreso;
	}

	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumReintegro() {
		return numReintegro;
	}

	public void setNumReintegro(int numReintegro) {
		this.numReintegro = numReintegro;
	}

	public int getNumIngreso() {
		return numIngreso;
	}

	public void setNumIngreso(int numIngreso) {
		this.numIngreso = numIngreso;
	}

}
