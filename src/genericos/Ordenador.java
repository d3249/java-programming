package genericos;

import java.util.ArrayList;
import java.util.List;

public class Ordenador {

	public static <T extends Comparable<T>> List<T> burbuja(List<T> original){
		
		List<T> nuevoArray = copiar(original);

		for (int i = 0; i < nuevoArray.size(); i++) {
			for (int j = i; j < nuevoArray.size(); j++) {
				if (nuevoArray.get(i).compareTo( nuevoArray.get(j)) > 0) {
					T tmp = nuevoArray.get(i);
					nuevoArray.set(i, nuevoArray.get(j));
					nuevoArray.set(j, tmp);
				}
			}
		}

		return nuevoArray;

	}

	private static <T extends Comparable<T>> List<T> copiar(List<T> array) {
		List<T> nuevoArray = new ArrayList<>();

		for(int i = 0; i < array.size(); i++) {
			nuevoArray.add(array.get(i));
		}
		
		return nuevoArray;
	}
}
