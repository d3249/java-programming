package sesion001.exepciones;

public class ConfidencialException extends RuntimeException {

	public ConfidencialException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConfidencialException(String message) {
		super(message);
	}
	
	

}
