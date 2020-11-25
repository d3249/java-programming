package sesion001.abstractos;

import java.util.List;

public class AjusteGaussiano extends AjustadorCalificaciones {

	private final double CALIFICACION_MAXIMA = 10.0;
	private final double DESVIACION_ESTANDAR_CUADRADA;
	private final double CALIFICACION_MAXIMA_REPORTADA;

	public AjusteGaussiano(List<Double> calificaciones) {
		super(calificaciones);
		CALIFICACION_MAXIMA_REPORTADA = encuentraMaximo();
		DESVIACION_ESTANDAR_CUADRADA = desviacionEstandarCuadrada();
	}

	@Override
	protected double ajusteIndividual(double calificacionOriginal) {

		double numerador = Math.pow(calificacionOriginal - CALIFICACION_MAXIMA_REPORTADA, 2);
		double denominador = (2 * DESVIACION_ESTANDAR_CUADRADA);

		double exponente = -1 * numerador / denominador;

		return CALIFICACION_MAXIMA * Math.exp(exponente);
	}

	private double desviacionEstandarCuadrada() {
		double promedio = promedio();

		double sum = 0.0;

		for (double calificacion : calificaciones) {
			sum = sum + Math.pow(calificacion - promedio, 2);
		}

		return sum / calificaciones.size();
	}

	private double promedio() {
		double sum = 0.0;
		for (double calificacion : calificaciones) {
			sum = sum + calificacion;
		}

		return sum / calificaciones.size();
	}

	private double encuentraMaximo() {
		double maximo = calificaciones.get(0);
		for (double calificacion : calificaciones) {
			if (calificacion > maximo) {
				maximo = calificacion;
			}
		}

		return maximo;
	}

}
