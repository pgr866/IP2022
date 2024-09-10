package org.ip.tema04;

import java.util.Arrays;

public class Ordenacion {

	public static void burbuja(int[] array) {
		int aux;
		for (int i = 1; i < array.length; i++)
			for (int j = 0; j < array.length - 1; j++)
				if (array[j] > array[j + 1]) {
					// Intercambiar
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
	}

	public static void burbujaMejorado(int[] array) {
		int aux;
		for (int i = 1; i < array.length; i++)
			for (int j = 0; j < array.length - i; j++)
				if (array[j] > array[j + 1]) {
					// Intercambiar
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
	}

	public static void burbujaMejoradoFlag(int[] array) {
		boolean cambiado = true;
		int aux;
		int i = 1;
		while (cambiado && (i < array.length)) {
			cambiado = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					// Intercambiar
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					cambiado = true;
				}
			}
			i++;
		}
	}

	public static void seleccion(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			// Buscar el minimo en array[i .. array.length-1]
			int valorMinimo = array[i];
			int posicionMinimo = i;
			for (int j = i + 1; j  < array.length; j++) {
				if (array[j] < valorMinimo) {
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
		int [] array1 = {23, 19, 45, 31, 15, -7, 0};
		int [] array2 = {15, 2, 20, 39, -5, 14, 0};
		System.out.println("Array sin ordenar: " + Arrays.toString(array1));
		burbujaMejoradoFlag(array1);
		System.out.println("Array ordenado por el metodo de la burbuja mejorado: "
				+ Arrays.toString(array1));
		System.out.println("Array sin ordenar: " + Arrays.toString(array2));
		seleccion(array2);
		System.out.println("Array ordenado por el metodo de seleccion: "
				+ Arrays.toString(array2));
	}
}
