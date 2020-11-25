package practica1.solucion;

public class AutoDriver {

	public static void main(String[] args) {
		AutoDeportivo auto = new AutoDeportivo(200);

		// Como el incremento debe ser de 15, debemos llamar acelerar() 4 veces para llegar a 90
		auto.acelerar();
		auto.acelerar();
		auto.acelerar();
		auto.acelerar();

		System.out.println("El auto va a " + auto.getVelocidad() + " km/h");

		try {
			auto.frenoDeEmergencia();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("El auto va a " + auto.getVelocidad() + " km/h");
		}
	}
}
