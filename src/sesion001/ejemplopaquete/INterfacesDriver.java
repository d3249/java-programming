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
		misVehiculos.add(new Bicicleta());
		misVehiculos.add(new Bicicleta());
		
		//Recupero la bicicleta
		Vehiculo vehiculoRecuperado = misVehiculos.get(0);
		
		vehiculoRecuperado.avanzar();
	
		
		
		if(vehiculoRecuperado instanceof Auto) {
			Auto elAuto = (Auto) vehiculoRecuperado;
			elAuto.getMarca();
		} else if(vehiculoRecuperado instanceof Bicicleta) {
			Bicicleta laBici = (Bicicleta) vehiculoRecuperado;
			laBici.pedalear();
		}
		
		int contAutos = 0;
		int contBicicletas = 0;
		
		for(Vehiculo v : misVehiculos) {
			if(v instanceof Auto) {
				contAutos++;
			}
			
			if(v instanceof Bicicleta) {
				contBicicletas++;
			}
		}
		
		System.out.println("Hay " + contAutos + " autos y " + contBicicletas + " bicicletas");
		
		
	}
}
