package sesion001.interfaces;

public class CalificacionMasDos implements AjusteIndividual{

	@Override
	public double ajusteIndividual(double calificacionOriginal) {
		return calificacionOriginal + 2;
	}

	
	
}
