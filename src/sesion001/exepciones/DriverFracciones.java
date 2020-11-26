package sesion001.exepciones;

import java.util.Scanner;

public class DriverFracciones {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Numerador");
			int num = scanner.nextInt();

			System.out.println("Denominador");
			int den = scanner.nextInt();
			Fraccion f = new Fraccion(num, den);

			System.out.println(f.toString() + " = " + f.valorDecimal());

		}
	}

}
