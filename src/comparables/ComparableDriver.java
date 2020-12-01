package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDriver {
	
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();

		Persona p1 = new Persona(20, "Ana");
		Persona p2 = new Persona(30, "Beto");
		Persona p3 = new Persona(24, "Cecilia");
		Persona p4 = new Persona(19, "Daniel");
		Persona p5 = new Persona(50, "Ester");
		
		
		listaPersonas.add(p5);
		listaPersonas.add(p2);
		listaPersonas.add(p1);
		listaPersonas.add(p4);
		listaPersonas.add(p3);

		Collections.sort(listaPersonas);
		
		for(Persona p : listaPersonas) {
			System.out.println(p);
		}

		Comparator<Persona> comparadorPersona = new ComparadorPersona();
		
		Collections.sort(listaPersonas, comparadorPersona);
	
		System.out.println("/////////////////////");
		for(Persona p : listaPersonas) {
			System.out.println(p);
		}
	}
	
	
////////
////////   si p1.compareTo(p2) > 0 lo cambias
////////
////////   si p2.compareTo(p1) > 0
////////   si p1.compareTo(p2) < 0
////////
	
	
	
	




	
	
	
	
	

}
