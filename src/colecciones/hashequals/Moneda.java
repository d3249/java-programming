package colecciones.hashequals;


public class Moneda extends Dinero {

	private final String aleacion;

	public Moneda(int monto, Divisa divisa, String aleacion) {
		super(monto, divisa);
		this.aleacion = aleacion;
	}


}
