package org.ip.tema01.ejemplostema;

public class EuclidesMetodo {
	/**
	 * Calcula el m�ximo com�n divisor de dos enteros positivos utilizando el
	 * algoritmo de Euclides
	 * 
	 * @param args
	 */
	public static int mcdEuclides(int dato1, int dato2) {
		int aux;
		while (dato1 % dato2 != 0) {
			aux = dato1;
			dato1 = dato2;
			dato2 = aux % dato2;
		}
		return dato2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato1 = 25;
		int dato2 = 10;
		System.out.println("El MCD de " + dato1 + " y " + dato2 + " es " + mcdEuclides(dato1, dato2));
	}
}
