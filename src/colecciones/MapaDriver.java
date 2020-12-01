package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapaDriver {

	public static void main(String[] args) {
		Map<String, Integer> calificaciones = new HashMap<>();

		calificaciones.put("Abel", 10);
		calificaciones.put("Beto", 5);
		calificaciones.put("Carlos", 10);
		calificaciones.put("Diana", 9);
		
//		for(String nombre : calificaciones.keySet()) {
//			System.out.println(nombre + " sacó " + calificaciones.get(nombre));
//		}
		
		for(Entry<String, Integer> renglon : calificaciones.entrySet()) {
			System.out.println(renglon.getKey() + " sacó " + renglon.getValue());
		}
		
		
		Map<Integer, String> listaMapa = new HashMap<>();
		
		listaMapa.put(0, "A");
		listaMapa.put(1, "B");
		listaMapa.put(2, "C");
		listaMapa.put(3, "D");
		
		for(int i = 0; i < listaMapa.size(); i++) {
			System.out.println("El elemento " + i + " vale " + listaMapa.get(i));
		}

		
		for(Entry<Integer, String> renglon : listaMapa.entrySet()) {
			System.out.println("El elemento " + renglon.getKey() + " vale " + renglon.getValue());
		}
		
	}
}
