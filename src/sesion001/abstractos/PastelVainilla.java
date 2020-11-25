package sesion001.abstractos;

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
