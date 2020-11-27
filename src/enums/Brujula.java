package enums;

public enum Brujula {

	ESTE(0), OESTE(180), NORTE(90), SUR(270), NORESTE(45);

	public final  Integer anguloGrados;

	private Brujula(Integer anguloGrados) {
		this.anguloGrados = anguloGrados;
	}
	
	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
	
}
