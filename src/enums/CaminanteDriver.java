package enums;

public class CaminanteDriver {

	public static void main(String[] args) {

		Desplazamiento[] desplazamientos = { new Desplazamiento(10, Brujula.ESTE), new Desplazamiento(10, Brujula.NORTE),
				new Desplazamiento(10, Brujula.OESTE), new Desplazamiento(10, Brujula.SUR), new Desplazamiento(5, Brujula.NORESTE) };
		
		for(Desplazamiento desplazamiento : desplazamientos) {
			System.out.println("El caminante se movió " + desplazamiento.getDistancia() + " hacia el " + desplazamiento.getDireccion() + " " + desplazamiento.direccionEnGrador());
		}

		
	
		System.out.println("las direcciones validas son");
		for(Brujula direcction : Brujula.values()) {
			System.out.println(direcction);
		}
		
	}
}
