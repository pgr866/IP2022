package org.ip.tema01.ejerciciosresueltos;

import java.util.Scanner;

public class Ejercicio05 {

	/**
	 * Muestra un mensaje en pantalla indicando si un anio bisiesto.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int anio = 0;
		// int anio = 1991;
		// PRE: anio > 0
		// System.out.print("Introduce el valor del anio => ");
		anio = entrada.nextInt();
		if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
			System.out.println("ANIO BISIESTO");
		} else {
			System.out.println("ANIO NO BISIESTO");
		}
		entrada.close();
	}
}
