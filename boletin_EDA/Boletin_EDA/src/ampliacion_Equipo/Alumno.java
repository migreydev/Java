package ampliacion_Equipo;

public class Alumno{
	
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	

	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) {
		super();
		this.nombre=nombre;
		this.dni=dni;
		this.edad=edad;
		this.ciudad=ciudad;
	}
	
	public String getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Alumno) {
			Alumno casteado = (Alumno) obj;
			sonIguales = this.nombre.equals(casteado.dni);
		}
		return sonIguales;	
	}
	
	@Override
	public String toString() {
	    return String.format(" Nombre: %s\n"
	                         + " DNI: %s\n"
	                         + "edad: %s\n"
	                         + "sexo: %s\n"
	                         + "Ciudad: %s\n",
	                         this.nombre, this.dni, this.edad, this.sexo, this.ciudad);
	}

	
	
	


}
