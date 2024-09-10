package org.ip.tema04;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaLineal {

	// El metodo busca el valor clave en el array 'array'
	public static int busquedaLineal(int [] array, int clave) {
		for (int i = 0; i < array.length; i++) {
			if (clave == array[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] array = {4, 6, 8, -5, 1};
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el valor que buscas en el array ");
		int clave = entrada.nextInt();
		int posicion = busquedaLineal(array, clave);
		if (posicion == -1) {
			System.out.println("El valor " + clave + " no esta en el array");
			System.out.println(Arrays.toString(array));
		}
		else {
			System.out.println("El valor " + clave + " esta en el array "
					+ "en la posicion " + (posicion + 1));
			System.out.println(Arrays.toString(array));
		}
		entrada.close();
	}
}
