package genericos;

public class CajaDriver {

	public static void main(String[] args) {
//		Caja<Integer> cajaEnteros = new Caja<>(5);
//
//		System.out.println(cajaEnteros.getContenido());
		
		int entero = 5;
		double doble = 5.5;

		Number general =  entero;
		
		System.out.println("El número vale " + general);

		general =  doble;
		
		System.out.println("El número ahora vale " + general);
		
///////////////////	
		
		Caja<Integer> cajaEntera = new Caja(5);
		Caja<Double> cajaDoble = new Caja(5.5);
		
		Caja<? extends Number> cajaNumeros;
	
		cajaNumeros = cajaEntera;
		cajaNumeros = cajaDoble;
//		cajaNumeros = new Caja<String>("Hola");

		Caja<? super Integer> cajaDeEnetroOSuperior;
		cajaDeEnetroOSuperior = cajaEntera;
//		cajaDeEnetroOSuperior = cajaDoble;
//		cajaDeEnetroOSuperior = new Caja<String>("Hola");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
