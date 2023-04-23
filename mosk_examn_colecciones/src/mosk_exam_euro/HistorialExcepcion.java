package mosk_exam_euro;

public class HistorialExcepcion extends Exception {

	private String message;
	
	public HistorialExcepcion() {
		
	}

	public HistorialExcepcion(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public HistorialExcepcion(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public HistorialExcepcion(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public HistorialExcepcion(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
