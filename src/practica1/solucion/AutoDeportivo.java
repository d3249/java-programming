package practica1.solucion;

public class AutoDeportivo extends Auto {
	private static final int INCREMENTO = 15;

	public AutoDeportivo(int velocidadMaxima) {
		super(velocidadMaxima);
	}

	@Override
	public void acelerar() {
		setVelocidad(getVelocidad() + INCREMENTO); 
	}

	@Override
	public void frenar() {
		setVelocidad(getVelocidad() - INCREMENTO); 
	}
	
	public void frenoDeEmergencia() {
		setVelocidad(0);
		throw new RuntimeException("Se ha activado el freno de emergencia");
	}

	
	

}
