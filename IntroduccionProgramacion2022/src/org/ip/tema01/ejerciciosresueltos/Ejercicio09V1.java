package org.ip.tema01.ejerciciosresueltos;

public class Ejercicio09V1 {

	/**
	 * Calcula el factorial de un entero positivo
	 * n! = n * (n-1) * (n-2) * ... * 2 * 1
	 * @param args
	 */
	public static void main(String[] args) {
		int dato = 9;
		long fact = 1;
		int i = 1;
		while (i <= dato){
			fact = fact * i;
			i++;
		}
		System.out.println("El factorial de " + dato + " es " + fact);
		
		// Otra forma de hacerlo con un bucle 'for' decreciente
		
		/*
		fact = 1;
		for(int j = dato; j>=1; j--){
			fact *= j;
		}
		System.out.println("El factorial de "+ dato + " es " + fact);
		*/
	}
}
