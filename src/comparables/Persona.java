package comparables;

public class Persona implements Comparable<Persona> {
	
	private int edad;
	private String nombre;

	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}

	@Override
	public int compareTo(Persona otro) {
		return this.nombre.compareTo(otro.nombre);
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	

}
