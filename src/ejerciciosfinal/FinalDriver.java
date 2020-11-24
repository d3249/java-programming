package ejerciciosfinal;

public class FinalDriver {

	public static void main(String[] args) {
		AtributosFinal atributos = new AtributosFinal();
		
		System.out.println("Pi vale " + atributos.PI);
		
		MetodosFinal metodos1 = new MetodosFinal();
		MetodosFinalHijo metodos2 = new MetodosFinalHijo();
		
		
		System.out.println("metodos 1, echo 5 " + metodos1.echo(5));
		System.out.println("metodos 2, echo 5 " + metodos2.echo(5));
		System.out.println("metodos 2, echo 5 " + metodos2.echo(5, 2));
		
		ColorRGB color = new ColorRGB(0, 0, 0);
		
	}
}
