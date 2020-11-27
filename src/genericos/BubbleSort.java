package genericos;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

	private final List<T> arrayOriginal;
	private final List<T> arrayOrdenado;

	public BubbleSort(T[] array) {
		this.arrayOriginal = new ArrayList<>();
		
		for(T elem : array) {
			arrayOriginal.add(elem);
		}
		
		
		this.arrayOrdenado = ordenar(arrayOriginal);
	}

	public List<T> original() {
		return arrayOriginal;
	}

	public List<T> ordenado() {
		return arrayOrdenado;
	}

	private List<T> ordenar(List<T> array) {

		List<T> nuevoArray = copiar(array);

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

	private List<T> copiar(List<T> array) {
		List<T> nuevoArray = new ArrayList<>();

		for(int i = 0; i < array.size(); i++) {
			nuevoArray.add(array.get(i));
		}
		
		return nuevoArray;
	}
	

	 
	
}
