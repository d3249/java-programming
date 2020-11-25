package practica1.solucion;

public class Auto {
	private static final int INCREMENTO = 10;
	private final int VELOCIDAD_MAXIMA;

	private int velocidad;

	public Auto( int velocidadMaxima) {
		VELOCIDAD_MAXIMA = velocidadMaxima;
		this.velocidad = 0;
	}

	public void acelerar() {
		setVelocidad(velocidad + INCREMENTO); 
	}

	public void frenar() {
		setVelocidad(velocidad - INCREMENTO);
	}

	public int getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(int velocidad) {

		if (velocidad > VELOCIDAD_MAXIMA) {
			velocidad = VELOCIDAD_MAXIMA;
		} else if (velocidad < 0) {
			velocidad = 0;
		}

		this.velocidad = velocidad;
	}

}
