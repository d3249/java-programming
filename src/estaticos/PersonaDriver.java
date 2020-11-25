package estaticos;

public class PersonaDriver {
	public static void main(String[] args) {

		Persona p1 = new Persona(20, 60);
		Persona p2 = new Persona(3, 18);
	
		
		System.out.println("Persona 1 tiene " + p1.getEdad() + " años y pesa "  + p1.getPeso() + " kg");
		System.out.println("Persona 1 tiene " + p2.getEdad() + " años y pesa "  + p2.getPeso() + " kg");
	
		
		p2.setEdad(4);

		System.out.println("Persona 1 tiene " + p1.getEdad() + " años y pesa "  + p1.getPeso() + " kg");
		System.out.println("Persona 1 tiene " + p2.getEdad() + " años y pesa "  + p2.getPeso() + " kg");
	
	
		System.out.println("Hay " + Persona.getInstancias() + " instancias de Persona");
		
		Persona p3 = new Persona(50, 70);
		
		System.out.println("Hay " + Persona.getInstancias() + " instancias de Persona");
	
		Persona p4 = new Persona(50, 70);
		
		System.out.println("Hay " + Persona.getInstancias() + " instancias de Persona");
	
		Persona p5 = new Persona(50, 70);
		
		System.out.println("Hay " + Persona.getInstancias() + " instancias de Persona");
	}
}
