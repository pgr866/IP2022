package org.ip.sesion05;

import java.util.Scanner;

public class EstadisticasArrays {
	
	public static double max(double[] array) {
		double max = array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	public static int max(int [] array) {
		int max = array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	public static double min(double[] array) {
		double min = array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	public static int min(int [] array) {
		int min = array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
	public static double media(double[] array) {
		double suma = 0;
		for (int i=0;i<array.length;i++) {
			suma += array[i];
		}
		double media = suma/array.length;
		return media;
	}
	public static double media(int [] array) {
		int suma = 0;
		for (int i=0;i<array.length;i++) {
			suma += array[i];
		}
		double media = ((double) suma)/array.length;
		return media;
	}
	public static double varianza(double[] array) {
		double suma = 0;
		for (int i=0;i<array.length;i++) {
			suma += Math.pow(array[i] - EstadisticasArrays.media(array), 2);
		}
		double var = suma/(array.length-1);
		return var;
	}
	public static double varianza(int [] array) {
		double suma = 0;
		for (int i=0;i<array.length;i++) {
			suma += Math.pow(array[i] - EstadisticasArrays.media(array), 2);
		}
		double varianza = suma/(array.length-1);
		return varianza;
	}
	public static double desviacionTipica(double [] array) {
		
		double stdDev = Math.sqrt(EstadisticasArrays.varianza(array));
		return stdDev;
	}
	public static double desviacionTipica(int [] array) {
		
		double stdDev = Math.sqrt(EstadisticasArrays.varianza(array));
		return stdDev;
		
	}
	public static void mostrarArray(double [] array) {
		System.out.print("Array de Reales: [");
		for (int i=0;i<array.length;i++) {
			if (i==array.length-1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
	}
	public static void mostrarArray(int [] array) {
		System.out.print("Array de Enteros: [");
		for (int i=0;i<array.length;i++) {
			if (i==array.length-1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arrayEnteros = {5, 10, 15, 20};
		double [] arrayReales = {5.0, 25.5, 15.75, 10.25, 12.5};
		
		EstadisticasArrays.mostrarArray(arrayEnteros);
		System.out.println("Numero Elementos del array de enteros: " + arrayEnteros.length);
		System.out.println("Minimo del array de enteros: " + EstadisticasArrays.min(arrayEnteros));
		System.out.println("Maximo del array de enteros: " + EstadisticasArrays.max(arrayEnteros));
		System.out.println("Media del array de enteros: " + EstadisticasArrays.media(arrayEnteros));
		System.out.println("Varianza del array de enteros: " + EstadisticasArrays.varianza(arrayEnteros));
		System.out.println("Desviacion Tipica del array de enteros: " + EstadisticasArrays.desviacionTipica(arrayEnteros));
		
		System.out.println();
		
		EstadisticasArrays.mostrarArray(arrayReales);
		System.out.println("Numero Elementos del array de reales: " + arrayReales.length);
		System.out.println("Minimo del array de reales: " + EstadisticasArrays.min(arrayReales));
		System.out.println("Maximo del array de reales: " + EstadisticasArrays.max(arrayReales));
		System.out.println("Media del array de reales: " + EstadisticasArrays.media(arrayReales));
		System.out.println("Varianza del array de reales: " + EstadisticasArrays.varianza(arrayReales));
		System.out.println("Desviacion Tipica del array de reales: " + EstadisticasArrays.desviacionTipica(arrayReales));
		
	}
}
