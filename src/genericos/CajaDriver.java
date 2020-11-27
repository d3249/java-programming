package genericos;

public class CajaDriver {

	public static void main(String[] args) {
		Caja<Integer, Double> cajaEnteros = new Caja<>(5);

		System.out.println(cajaEnteros.getContenido() + " se castea a " + cajaEnteros.castear());
	}
}
