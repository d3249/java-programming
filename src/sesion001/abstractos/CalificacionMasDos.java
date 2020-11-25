package sesion001.abstractos;

import java.util.List;

public class CalificacionMasDos extends AjustadorCalificaciones {
	
	public CalificacionMasDos(List<Double> calificaciones) {
		super(calificaciones);
	}

	@Override
	protected double ajusteIndividual(double calificacionOriginal) {
		return calificacionOriginal + 2;
	}

}
