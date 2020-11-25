package estaticos;

public class Persona {
	private static int instancias = 0;

	private int edad;
	private double peso;

	public Persona(int edad, double peso) {
		if(Persona.instancias == 4) {
			throw new RuntimeException("Sobrepoblación");
		}

		this.edad = edad;
		this.peso = peso;
		
		Persona.instancias = Persona.instancias + 1;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public  double getPeso() {
		return peso;
	}

	public  void setPeso(double peso) {
		this.peso = peso;
	}

	public static int getInstancias() {
		return instancias;
	}
	
	

}
