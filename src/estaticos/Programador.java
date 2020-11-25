package estaticos;

public class Programador extends Animal {
	private String lenguaje;

	public Programador(String nombre, String lenguaje) {
		super(nombre);
		this.lenguaje = lenguaje;
	}

	@Override
	public void comer() {
		System.out.println(" y sólo come chatarra");
		super.comer();
	}

	public String getLenguaje() {
		return lenguaje;
	}
	
	

}
