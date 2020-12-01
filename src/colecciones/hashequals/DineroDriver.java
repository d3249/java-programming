package colecciones.hashequals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DineroDriver {

	public static void main(String[] args) {
//		Billete washington = new Billete(1, Divisa.USD);
		
//		System.out.println(benito);
//		System.out.println(washington);
		
//		Dinero benito = new Dinero(20, Divisa.MXN);
//		Dinero benito2 = new Dinero(20, Divisa.MXN);
//
//		Dinero neza = new Dinero(100, Divisa.MXN);
//		Dinero neza2 = new Dinero(100, Divisa.MXN);
//
//		Dinero frida = new Dinero(500, Divisa.MXN);
//		Dinero frida2 = new Dinero(500, Divisa.MXN);
//		
//		List<Dinero> billetes = List.of(benito, benito2, neza, neza2, frida, frida2);
//
//	
//		Set<Dinero> set = new HashSet<>();
//		
//		set.addAll(billetes);
//		
//		System.out.printf("%s vs %s [%s]\n", benito, benito2, benito.equals(benito2));
//		
//		System.out.printf("Tienes %d billetes diferentes\n", set.size());
		
		Dinero billete20 = new Dinero(20, Divisa.MXN);
		Dinero billete20_2 = new Dinero(20, Divisa.MXN);
		Moneda moneda20 = new Moneda(20, Divisa.MXN, "latón");
	
		System.out.printf("Billete, reflexivo [%s]\n", billete20.equals(billete20));
		System.out.printf("Moneda, reflexivo [%s]\n", moneda20.equals(moneda20));

		
		System.out.printf("Billete, moneda [%s]\n", billete20.equals(moneda20));
		System.out.printf("Moneda, billete [%s]\n", moneda20.equals(billete20));
		
		
//		System.out.printf("Transitividad billete 1, moneda [%s]\n", billete20.equals(moneda20));
//		System.out.printf("Transitividad moneda, billete 2 [%s]\n", moneda20.equals(billete20_2));
//		System.out.printf("Transitividad billete 1, billete 2 [%s]\n", billete20.equals(billete20_2));
		
	}
}
