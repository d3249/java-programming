package sesion001;

public class CiclosFor {

	public static void main(String[] args) {

		String string = "Hola";

		for (int i = 0; i < string.length() ; i = i + 2) {
			System.out.println("El caracter en la posición " + i + " es " + string.charAt(i));
		}
		

		char[] arrayLetras = new char[] { 'a', 'v', 't', 'r', 'z' };

		
		for(char elemento : arrayLetras) {
			System.out.println(elemento);
		}

	}
}
