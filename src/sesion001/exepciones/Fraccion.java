package sesion001.exepciones;

public class Fraccion {

		private final int numerador;
		private final int denominador;

		public Fraccion(int numerador, int denominador)  {
			
			if(denominador == 0) {
				throw new DivisionPorCeroException("El denominador no puede ser cero");
			}
			
			this.numerador = numerador;
			this.denominador = denominador;
		}

		public double valorDecimal() {
			return (double) numerador / denominador;
		}

		@Override
		public String toString() {
			return String.format("%d/%d", numerador, denominador);
		}
		
		
		
		
}
