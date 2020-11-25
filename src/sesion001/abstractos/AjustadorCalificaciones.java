package sesion001.abstractos;

import java.util.ArrayList;
import java.util.List;

public abstract class AjustadorCalificaciones {

	
	protected final List<Double> calificaciones;

	public AjustadorCalificaciones(List<Double> calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	public List<Double> ajustar() {
		
		List<Double> ajustadas = new ArrayList<>();
	
		for(Double calificacion: calificaciones) {
			ajustadas.add(ajusteIndividual(calificacion));
		}
		
		return ajustadas;
		
	}
	
	protected abstract double ajusteIndividual(double calificacionOriginal);
	
	
}
