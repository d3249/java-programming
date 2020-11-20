package sesion001;

public class ObjetoX {
	
	private String nombre;
	private static ObjetoX instance;
	
	private ObjetoX() {
		this.nombre = "Juan";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
	
		if(nombre == null) {
			throw new RuntimeException("xxxxx");
		}
		
		this.nombre = nombre;
	}
	

	public static ObjetoX getInstance() {
		if(instance == null) {
			instance = new ObjetoX();
		}
	
		return instance;
	}
	

}
