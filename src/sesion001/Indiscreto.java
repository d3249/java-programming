package sesion001;

import java.util.Scanner;

public class Indiscreto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe tu año de nacimiento");

		int año = -1;

		do {
			if (scanner.hasNextInt()) {
				año = scanner.nextInt();
			} else {
				scanner.nextLine();
			}
		} while(año == -1);

		System.out.println("¿quieres publicar tu edad?");
		boolean decision = false;

		if (scanner.hasNextBoolean()) {
			decision = scanner.nextBoolean();
		}

		if (decision) {
			int edad = 2020 - año;

			if (edad > 45) {
				System.out.println("Mejor no...");
			} else {
				System.out.println("Este año cumpliste " + edad + " años");
			}

		} else {
			System.out.println("Ok, es nuestro secreto");
		}

		scanner.close();

	}

}
