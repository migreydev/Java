package complejo;

public class Complejo {

	 // Atributos de la clase Complejo
	  private double parteReal;
	  private double parteImaginaria;
	  
	  // Constructor
	 /*
	  * Funcionalidad, inicializar los atributos de la clase
	  */
	  public Complejo(double parteReal, double parteImaginaria) {
	    this.parteReal = parteReal;
	    this.parteImaginaria = parteImaginaria;
	  }
	  
	  // Métodos
	  /*
	   * Se crea un nuevo objeto en ambos objetos porque la aritmetica de numeros complejos generan
	   * como resultado un nuevo objeto.
	   */
	  public Complejo sumar(Complejo otroComplejo) {
	    double nuevaParteReal = this.parteReal + otroComplejo.parteReal;
	    double nuevaParteImaginaria = this.parteImaginaria + otroComplejo.parteImaginaria;
	    return new Complejo(nuevaParteReal, nuevaParteImaginaria);
	  }
	  
	  public Complejo restar(Complejo otroComplejo) {
	    double nuevaParteReal = this.parteReal - otroComplejo.parteReal;
	    double nuevaParteImaginaria = this.parteImaginaria - otroComplejo.parteImaginaria;
	    return new Complejo(nuevaParteReal, nuevaParteImaginaria);
	  }
	
	  //Método equals para comparar dos números complejos
	  /*
	   * Comparamos el atributo de la clase Complejo con el atributo de la ottra clase otroComplejo
	   */
	  public boolean equals(Complejo otroComplejo) {
		  return (this.parteReal==otroComplejo.parteReal && this.parteImaginaria==otroComplejo.parteImaginaria);
	  }
	  
	  
	  //Realizamos un toString para mostra la informacion de un número Complejo.
	  
	  	@Override
	  public String toString() {
		return "Número complejo (parte real= " + parteReal + ", parte imaginaria= " + parteImaginaria + ")";
	  

	}
}

