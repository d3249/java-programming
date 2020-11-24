package sesion001.ejemplopaquete.abstractos;

import java.util.ArrayList;
import java.util.List;

public class CalificacionesDriver {
	
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
	

		AjustadorCalificaciones ajuste1 = new CalificacionMasDos(calificaciones);
		AjustadorCalificaciones ajuste2 = new AjusteLineal(calificaciones);
		AjustadorCalificaciones ajuste3 = new AjusteGaussiano(calificaciones);
		
		
		System.out.println("Más dos puntos");
		mostrarJuntas(calificaciones, ajuste1.ajustar());

		System.out.println("Ajuste lineal");
		mostrarJuntas(calificaciones, ajuste2.ajustar());
		
		System.out.println("Ajuste Gaussiano");
		mostrarJuntas(calificaciones, ajuste3.ajustar());
	}
	
	
	private static void mostrarJuntas(List<Double> origininales, List<Double> ajustadas) {
		for(int i = 0; i < origininales.size(); i = i + 1) {
			System.out.println(origininales.get(i) + " -> " + ajustadas.get(i));
		}
	}


}
