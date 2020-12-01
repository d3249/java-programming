package colecciones.hashequals;

import java.util.Objects;

public class Dinero {
	private final int monto;
	private final Divisa divisa;

	public Dinero(int monto, Divisa divisa) {

		if (divisa == null) {
			throw new RuntimeException("Divisa inválida");
		}

		if (monto < 1) {
			throw new RuntimeException("Monto inválido");
		}

		this.monto = monto;
		this.divisa = divisa;
	}

	public int getMonto() {
		return monto;
	}

	public Divisa getDivisa() {
		return divisa;
	}

	// BCrypt (hash + salt)

	@Override
	public String toString() {
		return "Billete [monto=" + monto + ", divisa=" + divisa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(divisa, monto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (!(obj instanceof Dinero))
			return false;

		Dinero other = (Dinero) obj;
		if (divisa != other.divisa)
			return false;
		if (monto != other.monto)
			return false;
		return true;
	}

}
