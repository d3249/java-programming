package sesion001.abstractos;

public class NoInstansiableDriver {

	public static void main(String[] args) {
		NoInstansiable noQueNo = new Instansiable();
	
		System.out.println(noQueNo.hola("Edgar"));
		
	}
}
