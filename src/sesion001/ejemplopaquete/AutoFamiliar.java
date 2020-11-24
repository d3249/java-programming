package sesion001.ejemplopaquete;

public class AutoFamiliar extends Auto implements TransporteDeMotor {
	
	private int numeroAsientos;

	public AutoFamiliar(String str, int entero, int numeroAsientos) {
		super();
		this.numeroAsientos = numeroAsientos;
		
		this.velocidad = 10;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	

	

	public void otroMetodo() {
		System.out.println("Otro método");
	}

	public void acelerar() {
		int nuevaVelocidad = velocidad + 5;

		if (nuevaVelocidad > velocidadMaxima) {
			nuevaVelocidad = velocidadMaxima;
		}

		velocidad = nuevaVelocidad;
	}
	

	

}
