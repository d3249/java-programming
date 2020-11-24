package sesion001.ejemplopaquete.abstractos;

public class PasteleriaDriver {
	
	public static void main(String[] args) {
		Pastel[] pasteles = {new PastelChocolate(), new PastelVainilla()};
	
		for(Pastel p : pasteles) {
			System.out.println("Preparando pastel...");
			p.preparar();
		}
		
	}

}
