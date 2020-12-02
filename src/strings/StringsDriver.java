package strings;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringsDriver {

	public static void main(String[] args) {
		
//		StringBuilder base = new StringBuilder();
//		
//		
//		// "hola " + "mundo";
//		// new StringBuilder("hola ").append("mundo");
//		
//		base.substring(6, 8);
//
//		base.indexOf("H");
//		base.indexOf("hola");
//
//		
//		System.out.println(LocalDateTime.now());
//		
//		for(int i = 0; i < 1000000; i++ ) {
//			base.append("a");
//		}
//
//		System.out.println(LocalDateTime.now());
//		
//		String cadenaFinal = base.toString();
	
		
		String tel1 = "492 92 2 10 54";
		String tel2 = "492 92 2 10 5";
		
	
		System.out.println(tel1 + " es un teléfono válido " + tel1.matches("(\\d[- ]?){10}"));
		System.out.println(tel2 + " es un teléfono válido " + tel2.matches("(\\d[- ]?){10}"));

		Double x = 3452.23452345234523;
		
		String xFormateado = String.format("%.2f", x);
		
		System.out.println(xFormateado);
	
		LocalDate hoy = LocalDate.now();
	
		System.out.println(hoy.format(DateTimeFormatter.ofPattern("dd/MM")));
		
		
	}
}
