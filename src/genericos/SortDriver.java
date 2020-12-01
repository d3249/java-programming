package genericos;

import java.util.ArrayList;
import java.util.List;

import enums.Brujula;
import enums.Desplazamiento;

public class SortDriver {

	public static void main(String[] args) {
		Integer[] array = { 4, 2, 5, 7, 6, 35, 10, -7, 15, 4, 24 };


		BubbleSort<Integer> bubbleSort = new BubbleSort<>(array);

		for (Integer numero : bubbleSort.ordenado()) {
			System.out.println(numero);
		}

		System.out.println("--------------------");
		Double[] array2 = { 4.4, 2.4, 5.4, 7.4, 6.4, 35.4, 10.4, -7.4, 15.4, 4.4, 24.4 };


		BubbleSort<Double> bubbleSort2 = new BubbleSort<>(array2);

		for (Double numero : bubbleSort2.ordenado()) {
			System.out.println(numero);
		}
		
		System.out.println("--------------------");
		
		String[] nombres = {"Beto", "Ana", "Carlos"};

		BubbleSort<String> bubbleSort3 = new BubbleSort<>(nombres);

		System.out.println("--------------------");
		List<String> nombresList = new ArrayList<>();
		
		nombresList.add("Carlos");
		nombresList.add("Beto");
		nombresList.add("Ana");
		nombresList.add("Diana");

		for (String numero : Ordenador.burbuja(nombresList)) {
			System.out.println(numero);
		}
		
		System.out.println("--------------------");
		List<Desplazamiento> desplazamientos = new ArrayList<>();
	
		
		desplazamientos.add(new Desplazamiento(25, Brujula.NORESTE));
		desplazamientos.add(new Desplazamiento(60, Brujula.NORTE));
		desplazamientos.add(new Desplazamiento(46, Brujula.ESTE));
		desplazamientos.add(new Desplazamiento(54, Brujula.NORESTE));

		for (Desplazamiento numero : Ordenador.burbuja(desplazamientos)) {
			System.out.println(numero);
		}
	}
}
