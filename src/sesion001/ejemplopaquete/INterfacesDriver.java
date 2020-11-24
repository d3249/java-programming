package sesion001.ejemplopaquete;

import java.util.ArrayList;
import java.util.List;

public class INterfacesDriver {

	public static void main(String[] args) {
		List<Vehiculo>  misVehiculos = new ArrayList<Vehiculo>();
		
		Vehiculo miAuto = new Auto("Patito", 200);
		Vehiculo miBici = new Bicicleta();
		
		
		misVehiculos.add(miBici);
		misVehiculos.add(miAuto);
		
		//Recupero la bicicleta
		Vehiculo vehiculoRecuperado = misVehiculos.get(0);
		
		vehiculoRecuperado.avanzar();
	
		
		
		if(vehiculoRecuperado instanceof Auto) {
			Auto xxxx = (Auto) vehiculoRecuperado;
			
			xxxx.getMarca();
		} else if(vehiculoRecuperado instanceof Bicicleta) {
			
			Bicicleta xxxx = (Bicicleta) vehiculoRecuperado;
			
			xxxx.pedalear();
		}
	}
}
