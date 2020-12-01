package colecciones.hashequals;


public class Moneda extends Dinero {

	private final String aleacion;

	public Moneda(int monto, Divisa divisa, String aleacion) {
		super(monto, divisa);
		this.aleacion = aleacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((aleacion == null) ? 0 : aleacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		return super.equals(obj);

	}

}
