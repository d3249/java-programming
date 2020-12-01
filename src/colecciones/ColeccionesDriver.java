package colecciones;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ColeccionesDriver {

	public static void main(String[] args) {

		System.out.println("///////////// Iterable");
		Iterable<Integer> iterable = Arrays.asList(1, 4, 5, 6, 7, 4, 3, 5, 4, 65, 56, 5, 43, 3, 4, 31);

//		Iterator<Integer> iterador = iterable.iterator();
//
//		while(iterador.hasNext()) {
//			System.out.println("Siguiente elemento " + iterador.next());
//		}

		for (Integer i : iterable) {
			System.out.println("Siguiente elemento " + i);
		}

		Collection<Integer> coleccion = new ArrayList<>();

//		for(int i = 0; i < 16; i++ )
		for (Integer entero : iterable) {
			coleccion.add(entero);
		}

		System.out.println("La colección tiene " + coleccion.size() + " elementos");
		System.out.println("¿La colección contiene un 4? " + coleccion.contains(4));
		System.out.println("¿La colección contiene un 100? " + coleccion.contains(100));

		coleccion.remove(4);

		System.out.println("///////////// Collection");
		for (Integer entero : coleccion) {
			System.out.println(entero);
		}

		Set<Integer> conjunto = new TreeSet<>();

		System.out.println("////////// Set");

		conjunto.addAll(coleccion);

		for (Integer entero : conjunto) {
			System.out.println(entero);
		}

		System.out.println("///////////// Lista");
		List<Integer> lista = new ArrayList<>();

		lista.addAll(coleccion);

		int posicion56 = lista.indexOf(56);

		System.out.println("El elemento 56 está en la posición " + posicion56);
		// array[i] --> list.get(i)
		System.out.println("A ver si es cierto " + lista.get(posicion56));

		// array[i] = x --> list.set(i, x)
		lista.set(posicion56, 65);
		System.out.println("Lo cambiamos a " + lista.get(posicion56));

		System.out.println(" El elemento 4 está en la posición (por primera vez) " + lista.indexOf(4));
		System.out.println(" El elemento 4 está en la posición (por última vez) " + lista.lastIndexOf(4));

		System.out.println(" El elemento 307 está en la posición " + lista.indexOf(307));

		System.out.println("///////////// Sublista");
		List<Integer> sublista = lista.subList(5, 11);
		for (Integer elemento : sublista) {
			System.out.println(elemento);
		}

		System.out.println("//////// Cola");

		// push(a) -> [a]
		// push(b) -> [b, a]
		// push(c) -> [c, b, a]
		// pollLast() -> [c, b]
		// pollFirts() -> [b]

		Deque<String> filaTortillas = new ArrayDeque<>();

		filaTortillas.add("Abel");
		filaTortillas.add("Beto");
		filaTortillas.add("Carlos");
		filaTortillas.add("Diana");
		

		while (filaTortillas.peekFirst() != null) {
			String atendiendo = filaTortillas.pollFirst();
			System.out.println("Estamos atendiendo a " + atendiendo);
		}
		
		
		Deque<String> platos = new ArrayDeque<>();
		
		platos.push("plato 1");
		platos.push("plato 2");
		platos.push("plato 3");
		platos.push("plato 4");
		platos.push("plato 5");
		platos.push("plato 6");
		
		
		while (platos.peekFirst() != null) {
			String usando = platos.pollFirst();
			System.out.println("Estamo usando el " + usando);
		}
		
		
		
		

	}
}
