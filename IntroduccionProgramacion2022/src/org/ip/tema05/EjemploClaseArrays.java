package org.ip.tema05;

import java.util.Arrays;

public class EjemploClaseArrays {

	public static void main(String[] args) {
		int [] array1 = {2, 4, 7, 10};
		int [] array2 = {2, 4, 7, 10};
		int [] array3 = {20, 30, 40, 50};
		int valor = 50;
		if (Arrays.equals(array1, array2))
			System.out.println(Arrays.toString(array1) + " coincide con "
					+ Arrays.toString(array2));
		else
			System.out.println(Arrays.toString(array1) + " no coincide con "
					+ Arrays.toString(array2));
		int posicion = Arrays.binarySearch(array3, valor);
		if (posicion < 0)
			System.out.println("El valor " + valor + " no esta en "
					+ Arrays.toString(array3));
		else
			System.out.println("El valor " + valor + " esta en la posicion "
					+(posicion + 1) + " del array " + Arrays.toString(array3));
	}
}
