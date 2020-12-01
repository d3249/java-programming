package colecciones;

import java.util.Arrays;

public class JavaModernoDriver {

	public static void main(String[] args) {
		var miLista = Arrays.asList("asdfas", "sadfsdfs", "edkrekrke");
		miLista.stream().forEach(System.out::println);

	}
}
