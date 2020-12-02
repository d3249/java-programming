package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OtroSort {

	public static <T extends Comparable<T>> List<T> sort(List<T> original) {

		if (original.size() <= 1) {
			return original;
		}

		List<T> menores = new ArrayList<>();
		List<T> mayores = new ArrayList<>();

		T elementoMedio = original.get(0);

		for (T elemento : original) {
			if (!elemento.equals(elementoMedio)) {
				if (elemento.compareTo(elementoMedio) < 0) {
					menores.add(elemento);
				} else {
					mayores.add(elemento);
				}
			}
		}

		List<T> menoresOrdenados = sort(menores);
		List<T> mayoresOrdenados = sort(mayores);

		List<T> listaFinal = menoresOrdenados;
		
		listaFinal.add(elementoMedio);
		listaFinal.addAll(mayoresOrdenados);

		return listaFinal;

	}

}
