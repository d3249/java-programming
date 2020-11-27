package genericos;

public class Caja <T extends Number, U> {

	private T contenido;

	public Caja(T contenido) {
		this.contenido = contenido;
	}

	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	}
	

	public U castear() {
		return (U) contenido;
	}
	
}
