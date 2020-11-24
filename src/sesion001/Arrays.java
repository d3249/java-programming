package sesion001;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		int[] miArray = new int[10];
		int[] miOtroArray = { 1, 2, 3, 4 };

		String[] miArrayS = { "Hola", "Mundo" };

		for (String i : miArrayS) {
			System.out.println(i);
		}

		List<Integer> miListaDeEnteros = new LinkedList<>();

		miListaDeEnteros.add(1);
		miListaDeEnteros.add(2);
		miListaDeEnteros.add(3);
		miListaDeEnteros.add(4);

		for (Integer i : miListaDeEnteros) {
			System.out.println(i);
		}

		System.out.println("#########################");

		miListaDeEnteros.add(1);
		miListaDeEnteros.add(2);
		miListaDeEnteros.add(3);
		miListaDeEnteros.add(4);

		for (Integer i : miListaDeEnteros) {
			System.out.println(i);
		}

		System.out.println(miListaDeEnteros.get(0));

		System.out.println("###########################");

		List<Integer> listaNumeros = new ArrayList<>();

		// Add agrega elementos

		listaNumeros.add(5);
		listaNumeros.add(5);
		listaNumeros.add(4);

		// array[index] -> lista.get(index)

		for (int i = 0; i < listaNumeros.size(); i = i + 1) {
			System.out.println("Elemento " + i + " es " + listaNumeros.get(i));
		}

		// lista.remove(index) -> array[index] = null/0
		listaNumeros.remove(1);

		listaNumeros.set(0, 10);

		for (int i = 0; i < listaNumeros.size(); i = i + 1) {
			System.out.println("Set");
			System.out.println("Elemento " + i + " es " + listaNumeros.get(i));
		}

		System.out.println("La lista tiene un 10? " + listaNumeros.contains(10));
		System.out.println("La lista tiene un 5? " + listaNumeros.contains(5));

		listaNumeros.clear();

		System.out.println("Clean");
		for (int i = 0; i < listaNumeros.size(); i = i + 1) {
			System.out.println("Elemento " + i + " es " + listaNumeros.get(i));
		}
	}

}
