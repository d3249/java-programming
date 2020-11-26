package sesion001.exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverExcepciones {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe un numerador");

		try {
			int numerador = scanner.nextInt();
			System.out.println("Ingresaste un número");

			System.out.println("Escribe un denominador");
			int denominador = scanner.nextInt();

			System.out.println(numerador + "/" + denominador + " = " + ((double) numerador / denominador));
		} catch (InputMismatchException e) {
			System.out.println("Hubo un error de mismatch [" + e.toString() + "]");
			scanner.nextLine();
			
			throw new ConfidencialException("Hubo un error, y fue este", e);
			
		} finally {
			System.out.println("Cerrando el scanner");
			scanner.close();
		}

	}

}
