package sesion001.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		
		List<Double> calificaciones = new ArrayList<>();
		
		calificaciones.add(8.0);
		calificaciones.add(5.3);
		calificaciones.add(7.9);
		calificaciones.add(6.4);
		calificaciones.add(3.2);
		calificaciones.add(7.8);
		calificaciones.add(2.0);
		calificaciones.add(0.0);
		calificaciones.add(7.3);
		calificaciones.add(6.4);
	
		AjusteIndividual ajusteIndividual1 = new CalificacionMasDos();
		Ajustador ajustador1 = new Ajustador(ajusteIndividual1, calificaciones);
		
		
		System.out.println("Más dos puntos");
		mostrarJuntas(calificaciones, ajustador1.ajustar());
	}

	private static void mostrarJuntas(List<Double> origininales, List<Double> ajustadas) {
		for(int i = 0; i < origininales.size(); i = i + 1) {
			System.out.println(origininales.get(i) + " -> " + ajustadas.get(i));
		}
	}
}
