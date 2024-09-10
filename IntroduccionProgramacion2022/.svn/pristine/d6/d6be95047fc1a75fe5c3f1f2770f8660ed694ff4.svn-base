package org.ip.tema02.ejerciciosresueltos;

public class EjerciciosArrays {

	public static void mostrarArrayConIndices(int [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}		
	}

	public static void mostrarArraySinIndices(boolean [] array) {
		System.out.print("Array:[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1)
				System.out.print(array[i] + ", ");
			else
				System.out.print(array[i] + "]");				
		}
	}

	public static void completarArrayPosicion(int [] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

	public static void completarArrayValor(int [] array, int valor) {
		for (int i = 0; i < array.length; i++) {
			array[i] = valor;
		}
	}

	public static void completarArrayPotenciasDos(int [] array) {
		int potencia = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = potencia;
			potencia *= 2;
		}
	}

	public static int buscarEnArray(double [] array, double valor) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valor)
				return i;
		}
		return -1;
	}
	
	public static boolean [] arrayBooleanos(int tamano) {
		boolean [] array = new boolean[tamano];
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0)
				array[i] = true;
			else
				array[i] = false;
			//array[i] = (i % 2 == 0) ? true : false;
		}
		return array;
	}

	public static int numeroDeVerdaderos(boolean [] array) {
		int numeroVerdaderos = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == true)
				numeroVerdaderos++;
		}
		return numeroVerdaderos;
	}
		
	public static void main(String[] args) {
		// Ejercicio 1
		//int [] array = new int[7];
		//completarArrayPosicion(array);
		//mostrarArraySinIndices(array);
		//System.out.println();
		//completarArrayValor(array, 7);
		//mostrarArraySinIndices(array);
		//System.out.println();
		//completarArrayPotenciasDos(array);
		//mostrarArraySinIndices(array);

		// Ejercicio 2
		//double [] array = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45, 99.993, 11123};
		//double valor = 13.2;
		//System.out.println("El elemento " + valor + " esta en la posicion " + buscarEnArray(array, valor));
		
		// Ejercicio 3
		boolean [] array = arrayBooleanos(7);
		System.out.println("Numero de verdaderos = " + numeroDeVerdaderos(array));
	}
}
