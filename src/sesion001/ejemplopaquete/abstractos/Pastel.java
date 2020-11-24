package sesion001.ejemplopaquete.abstractos;

public abstract class Pastel {
	

	public void preparar() {

		System.out.println("Preparar la harina");
		System.out.println("Agregar huevos");
		System.out.println("Agregar leche");
		System.out.println("Agregar el ingrediente secreto (" + ingredienteSecreto() + ")");
		System.out.println("Meter al horno a 180 grados por " + tiempo() + " minutos");
		
	}
	
	protected abstract String ingredienteSecreto();

	protected abstract int tiempo();

}
