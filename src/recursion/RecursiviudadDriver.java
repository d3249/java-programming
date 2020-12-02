package recursion;

import java.util.ArrayList;
import java.util.List;

import comparables.Persona;

public class RecursiviudadDriver {

	public static void main(String[] args) {

		List<Persona> lista = new ArrayList<>();

		lista.add(new Persona(30, "Pedro"));
		lista.add(new Persona(25, "Ana"));
		lista.add(new Persona(32, "Josué"));
		lista.add(new Persona(18, "Betty"));

		List<Persona> ordenada = OtroSort.sort(lista);

		for (Persona p : ordenada) {
			System.out.println(p);
		}

		
		
		
		// Tail recusion

//		long n = 5000000;
//	
//		System.out.println(n + " factorial= " + Factorial.factorial(n));
	}
}
