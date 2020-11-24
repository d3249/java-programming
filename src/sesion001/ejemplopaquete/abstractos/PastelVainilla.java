package sesion001.ejemplopaquete.abstractos;

public class PastelVainilla extends Pastel {

	@Override
	protected String ingredienteSecreto() {
		return "vainilla";
	}

	@Override
	protected int tiempo() {
		return 45;
	}

}
