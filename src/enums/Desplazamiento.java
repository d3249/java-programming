package enums;

public class Desplazamiento implements Comparable<Desplazamiento> {

	private final int distancia;
	private final Brujula direccion;

	public Desplazamiento(int distancia, Brujula direccion) {
		this.distancia = distancia;
		this.direccion = direccion;
	}

	public int getDistancia() {
		return distancia;
	}

	public Brujula getDireccion() {
		return direccion;
	}

	public int direccionEnGrador() {
		return direccion.anguloGrados;
	}

	@Override
	public int compareTo(Desplazamiento otro) {
		return this.distancia - otro.distancia;
	}

	@Override
	public String toString() {
		return "Desplazamiento [distancia=" + distancia + ", direccion=" + direccion + "]";
	}
	

	

}
