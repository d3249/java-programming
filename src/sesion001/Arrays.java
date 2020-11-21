package sesion001;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		int[] miArray = new int[10];
		int[] miOtroArray = { 1, 2, 3, 4 };
		
		String[] miArrayS = {"Hola", "Mundo"};
		
		for(String i : miArrayS) {
			System.out.println(i);
		}
		
		List<Integer> miListaDeEnteros = new LinkedList<>();
	
		miListaDeEnteros.add(1);
		miListaDeEnteros.add(2);
		miListaDeEnteros.add(3);
		miListaDeEnteros.add(4);
	
	
		for(Integer i : miListaDeEnteros) {
			System.out.println(i);
		}

		System.out.println("#########################");

		miListaDeEnteros.add(1);
		miListaDeEnteros.add(2);
		miListaDeEnteros.add(3);
		miListaDeEnteros.add(4);
		
		for(Integer i : miListaDeEnteros) {
			System.out.println(i);
		}
		
		System.out.println(miListaDeEnteros.get(0));
		
	}

}
