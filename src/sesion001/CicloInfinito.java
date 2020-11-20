package sesion001;

public class CicloInfinito {
	
	public static void main(String[] args) throws Exception {
		
		int contador = 0;

		while(true) {

			System.out.println("Hola");
			
			contador = contador + 1;
			
			if(contador == 10) {
				break;
			}
			
			Thread.sleep(100);
		}
	}

}
