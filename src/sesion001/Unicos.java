package sesion001;

import java.util.Scanner;

public class Unicos {
	
	public static void main(String[] args) {
		int[] conjunto = new int[5];
	
		int posicionActual = 0;

		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Escribe un número");
			int entrada = scanner.nextInt();
			
			boolean esRepetido = false;
			
//			for(int num : conjunto) {
			for(int i = 0; i < conjunto.length; i += 1) {
//				if(num == entrada) {
				if(conjunto[i] == entrada) {
					esRepetido = true;
					break;
				}
			}
			
			if(!esRepetido) {
				conjunto[posicionActual] = entrada;
				posicionActual += 1;
			}
			
			
		} while(posicionActual < 5);

		for(int salida: conjunto) {
			System.out.println(salida);
		}
	
		scanner.close();
		
	}

}
