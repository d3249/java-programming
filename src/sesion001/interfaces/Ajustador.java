package sesion001.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Ajustador {
	private final AjusteIndividual ajusteIndividual;
	private final List<Double> calificaciones;

	public Ajustador(AjusteIndividual ajusteIndividual, List<Double> calificaciones) {
		this.ajusteIndividual = ajusteIndividual;
		this.calificaciones = calificaciones;
	}
	
	public List<Double> ajustar(){
		List<Double> ajustadas = new ArrayList<>();
		
		for(Double calificacion: calificaciones) {
			ajustadas.add(ajusteIndividual.ajusteIndividual(calificacion));
		}
		
		return ajustadas;
	}

	
	

}
