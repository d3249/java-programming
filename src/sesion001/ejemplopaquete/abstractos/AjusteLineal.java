package sesion001.ejemplopaquete.abstractos;

import java.util.List;

public class AjusteLineal extends AjustadorCalificaciones {
	private final double factor;

	public AjusteLineal(List<Double> calificaciones) {
		super(calificaciones);

		double calificacionMaxima = calificaciones.get(0);

		for (double calificacion : calificaciones) {
			if (calificacion > calificacionMaxima) {
				calificacionMaxima = calificacion;
			}
		}
		
		factor = 10 / calificacionMaxima;
	}

	@Override
	protected double ajusteIndividual(double calificacionOriginal) {
		return calificacionOriginal * factor;
	}

}
