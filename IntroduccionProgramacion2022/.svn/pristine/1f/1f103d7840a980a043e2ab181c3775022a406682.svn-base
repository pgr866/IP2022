package org.ip.tema01.ejemplostema;

public class Euclides {
	/**
	 * Calcula el maximo comun divisor de dos enteros positivos utilizando el
	 * algoritmo de Euclides
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dato1 = 375;
		int dato2 = 222;
		int aux;
		//System.out.println("* " + (dato1 % dato2));
		while (dato1 % dato2 != 0) {
			aux = dato1;
			dato1 = dato2;
			dato2 = aux % dato2;
			//System.out.println("+++ " + dato1 + ", " + dato2 + ", " + (dato1 % dato2));
		}
		System.out.println("El MCD de los valores introducidos es " + dato2);
	}
}
