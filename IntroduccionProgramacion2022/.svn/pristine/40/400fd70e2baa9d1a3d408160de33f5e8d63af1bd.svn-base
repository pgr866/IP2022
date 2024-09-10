package org.ip.tema03.ejemplostema;

public class ExcepcionIntervaloPrincipal {

	public static void rango(int num, int den) throws ExcepcionIntervalo {
		if ((num > 100) || (den < -5))
			throw new ExcepcionIntervalo("Numeros fuera de rango");
	}

	public static void main(String[] args) {
		int numerador = 120;
		int denominador = 5;
		int cociente;
		try {
			rango(numerador, denominador);
			cociente = numerador / denominador;
			System.out.println("El cociente es: " + cociente);
		}
		catch (ExcepcionIntervalo ex) {
			System.out.println("Al calcular el rango se ha producido una");
			System.out.println("excepcion con el mensaje: " + ex.getMessage());
		}
		System.out.println("FIN");
	}
}
