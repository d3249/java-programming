package sesion001.ejemplopaquete;

public class Auto implements Vehiculo {

	private String marca;
	protected int velocidad;
	protected int velocidadMaxima;

	public Auto() {
		this.marca = "Patito";
		this.velocidadMaxima = 80;
		this.velocidad = 0;
	}

	
	
	
	public Auto(String str, int entero) {

		if (str == null) {
			throw new RuntimeException("La marca no puede ser nula");
		}

		if (entero < 0) {
			throw new RuntimeException("La velocidad máxima no puede ser negativa");
		}

		this.marca = str;
		this.velocidadMaxima = entero;
		this.velocidad = 0;
	}
	
	public void abordar() {
		System.out.println("Abordaste");
	}
	
	
	

	@Override
	public void acelerar() {
		int nuevaVelocidad = velocidad + 10;

		if (nuevaVelocidad > velocidadMaxima) {
			nuevaVelocidad = velocidadMaxima;
		}

		velocidad = nuevaVelocidad;
	}
	
	public void avanzar() {
		System.out.println("Está avanzando");
	}

	public void frenar() {
		int nuevaVelocidad = velocidad - 10;

		if (nuevaVelocidad < 0) {
			nuevaVelocidad = 0;
		}

		velocidad = nuevaVelocidad;
	}

	public String getMarca() {
		return marca;
	}

	public int getVelocidad() {
		return velocidad;
	}

}
