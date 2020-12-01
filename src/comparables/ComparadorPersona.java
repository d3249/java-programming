package comparables;

import java.util.Comparator;

public class ComparadorPersona implements Comparator<Persona>{

	@Override
	public int compare(Persona arg0, Persona arg1) {
		return arg0.getEdad() - arg1.getEdad();
	}

}
