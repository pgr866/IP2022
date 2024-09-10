package org.ip.sesion08;

import org.ip.sesion07.Fraccion;

public class OrdenacionArray {
	
	public static void burbuja(double[] array) {
		double aux;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}
	
	public static void burbujaMejoradoFlag(double[] array) {
		boolean cambiado = true;
		double aux;
		for (int i = 1;cambiado && (i < array.length);i++) {
			cambiado = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > (array[j + 1])) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					cambiado = true;
				}
			}
		}
	}
	
	public static void seleccion(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			double valorMinimo = array[i];
			int posicionMinimo = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < valorMinimo) {
					valorMinimo = array[j];
					posicionMinimo = j;
				}
			}
			if (posicionMinimo != i) {
				array[posicionMinimo] = array[i];
				array[i] = valorMinimo;
			}
		}
	}
	
	public static void burbuja(Comparable[] array) {
		Fraccion aux;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j + 1]) == 1) {
					aux = (Fraccion) array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}
	
	public static void burbujaMejoradoFlag(Comparable[] array) {
		boolean cambiado = true;
		Fraccion aux;
		for (int i = 1; i < array.length; i++) {
			cambiado = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j].compareTo(array[j + 1]) == 1) {
					aux = (Fraccion) array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
					cambiado = true;
				}
			}
		}
	}
	
	public static void seleccion(Comparable[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			Fraccion valorMinimo = (Fraccion) array[i];
			int posicionMinimo = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(valorMinimo) == -1) {
					valorMinimo = (Fraccion) array[j];
					posicionMinimo = j;
				}
			}
			if (posicionMinimo != i) {
				array[posicionMinimo] = array[i];
				array[i] = valorMinimo;
			}
		}
	}
	
}
