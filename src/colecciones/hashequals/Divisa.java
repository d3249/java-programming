package colecciones.hashequals;

public enum Divisa {
	MXN("pesos"), USD("dólares"), CAN("dólares canadienses");
	
	private final String nombre;
	
	private Divisa(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public String toString() {
		return nombre;
	}
}
