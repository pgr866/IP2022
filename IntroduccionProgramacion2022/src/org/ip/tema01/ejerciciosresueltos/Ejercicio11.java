package org.ip.tema01.ejerciciosresueltos;

public class Ejercicio11 {

	/**
	 * Muestra las tablas de multiplicar del 1 al 10
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("   TABLA DEL " + i);
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				System.out.println("     " + i + "X" +j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
