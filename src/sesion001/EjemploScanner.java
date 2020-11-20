package sesion001;

import java.util.Scanner;

public class EjemploScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Escribe tu nombre");
//
//		String nombre = scanner.nextLine();
//
//		System.out.println("Hola " + nombre);
//
		System.out.println("Un número o un boolean");

		
		
		
		if (scanner.hasNextInt()) {
			int unNumero = scanner.nextInt();
	
			String mensaje = unNumero > 0 ? " es positivo" : " es negativo" ;
			
			System.out.println(unNumero + mensaje);

		} else if (scanner.hasNextBoolean()) {
			boolean unBoolean = scanner.nextBoolean();
			System.out.println("Escribiste un booleano " + unBoolean);
		} else {
			System.out.println("Debe ser un número o un boolean");
		}

		scanner.close();


	}
	

}
