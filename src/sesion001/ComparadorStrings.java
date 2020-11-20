package sesion001;

import java.util.Scanner;

public class ComparadorStrings {

	public static void main(String[] args) {
		String s1 = "Hola"; // En estas dos declaraciones se puede saber en tiempo de compilación que
		String s2 = "Hola"; // son iguales, por lo que ambas usan la misma referencia.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe una palabra");
		String s3 = scanner.next();

		System.out.println("Escribe la misma palabra");
		String s4 = scanner.next();

		// Por otro lado, es imposible saber qué valores tendrán s3 y s4, por lo que cada uno
		// será un objeto separado, aunque su contenido sea igual.

		System.out.println(s1 + " == " + s2 + "(" + (s1 == s2) + ")");
		System.out.println(s3 + " == " + s4 + "(" + (s3 == s4) + ")");
		System.out.println(s3 + ".equals(" + s4 + ") (" + (s3.equals(s4)) + ")");

		scanner.close();
	}

}
