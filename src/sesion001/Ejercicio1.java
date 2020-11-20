package sesion001;

public class Ejercicio1 {

	public static void main(String[] args) {

		byte unByte = 8; short unShort = 128;
		int unEntero = 5;
		long unLong = 120123L;

		float unFloat = 6.0F;
		double unDouble = 6.7;

		char unChar = 'y';

		boolean unBoolean = false;

		System.out.println(unByte);
		System.out.println(unShort);
		System.out.println(unEntero);
		System.out.println(unLong);

		System.out.println(unFloat);
		System.out.println(unDouble);

		System.out.println(unChar);

		System.out.println(unBoolean);

		String unString = "Hola";
		unString = unString + " mundo";
		unString = unString + " cruel";

		System.out.println(unString);

		String hola = "Hola";
		String nombre = "Edgar";
		String noAsignado = "Siempr sí se asignó este valor";

		System.out.println(hola);
		System.out.println(nombre);
		System.out.println(noAsignado + " tiene una longitud de " + noAsignado.length());

		System.out.println(noAsignado.substring(7, 19));

		System.out.println(noAsignado.toUpperCase());

		Integer x = 5;
		Integer y = 5;
		

		String s1 = "hola";
		String s2 = "HOLA";

		System.out.println(x + " es igual a " + y + "? " + (x == y));
		System.out.println(s1 + " es igual a " + s2 + "? " + (s1.equalsIgnoreCase(s2)));

		System.out.println(s1 + " compareTo " + s2 + "? " + (s1.compareTo(s2)));
		System.out.println(s1 + " compareTo (ignore case)" + s2 + "? " + (s1.compareToIgnoreCase(s2)));

	}
	

}
