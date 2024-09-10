package org.ip.tema04;

import java.util.Arrays;

import org.ip.sesion07.Fraccion;

public class OrdenacionGenerica {

	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void seleccion(Comparable[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			// Buscar el minimo en array[i .. array.length-1]
			Comparable valorMinimo = array[i];
			int posicionMinimo = i;
			for (int j = i + 1; j  < array.length; j++) {
				if (array[j].compareTo(valorMinimo) < 0) {
					valorMinimo = array[j];
					posicionMinimo = j;
				}
			}
			// Intercambio array[i] con
			// array[posicionMinimo] si es necesario
			if (posicionMinimo != i) {
				array[posicionMinimo] = array[i];
				array[i] = valorMinimo;
			}
		}
	}

	public static void main(String[] args) {
		Fraccion [] arrayFracciones = {new Fraccion(9, 2), new Fraccion(-3, 4),
				new Fraccion(7, 5), new Fraccion(1, 5)};
		System.out.println("El array de fracciones es: " + Arrays.toString(arrayFracciones));
		seleccion(arrayFracciones);
		System.out.println("El array de fracciones ordenado es: " + Arrays.toString(arrayFracciones));
		Integer [] arrayEnteros = {new Integer(7), new Integer(9), new Integer(3)};
		System.out.println("El array de enteros es: " + Arrays.toString(arrayEnteros));
		seleccion(arrayEnteros);
		System.out.println("El array de enteros ordenado es: " + Arrays.toString(arrayEnteros));
		String [] arrayStrings = {"Lopez", "Ayala", "Garcia", "Benitez"};
		System.out.println("El array de strings es: " + Arrays.toString(arrayStrings));
		seleccion(arrayStrings);
		System.out.println("El array de strings ordenado es: " + Arrays.toString(arrayStrings));
	}
}
