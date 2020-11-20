package sesion001;

import sesion001.ejemplopaquete.AutoFamiliar;

public class AutoDriver {
	
	public static void main(String[] args) {
		AutoFamiliar af1 = new AutoFamiliar("Dodge", 160, 8);

		af1.acelerar();
		
	
		System.out.println("Velocidad " + af1.getVelocidad());
	}

}
