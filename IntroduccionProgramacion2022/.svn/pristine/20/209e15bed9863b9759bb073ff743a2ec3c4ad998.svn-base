package org.ip.tema03.ejerciciosresueltos;

public class TestArrayEnteros {

	public static void main(String[] args) {

		int[] arrayExamen = {5, 10, -15, 2, -4, 23, 7, -13, 8, 17, 27};
		int[] otroArrayExamen = {20, 6, -30, 8, 1, 30, -2};

		ArrayEnteros objetoArray1 = new ArrayEnteros(arrayExamen);
		ArrayEnteros objetoArray2 = new ArrayEnteros(otroArrayExamen);
		ArrayEnteros objetoArray3 = new ArrayEnteros(11);

		System.out.println("Array 1: " + objetoArray1.toString());

		System.out.println("Array 2: " + objetoArray2.toString());

		System.out.println("Array 3: " + objetoArray3.toString());

		System.out.println("Numero de elementos array 1: " + objetoArray1.getNumeroElementos());
		System.out.println("Valor de la posicion 2 del array 2: " + objetoArray2.getValorElemento(2));
		System.out.println("Valor de la posicion 7 del array 3: " + objetoArray3.getValorElemento(7));
		objetoArray3.setValorElemento(7, 0);
		System.out.println("Valor de la posicion 7 del array 3 (modificada): " + objetoArray3.getValorElemento(7));

		System.out.println("Rango de valores del array 1: " + objetoArray1.getRangoValores());
		System.out.println("Rango de valores del array 2: " + objetoArray2.getRangoValores());
		System.out.println("Rango de valores del array 3: " + objetoArray3.getRangoValores());

		objetoArray3.setValorElemento(3, 0);
		objetoArray3.setValorElemento(9, 1);
		objetoArray3.setValorElemento(5, 1);
		objetoArray3.setValorElemento(10, 2);

		System.out.println("Nuevo Array 3: " + objetoArray3.toString());

		System.out.println("Rango de valores del array 3: " + objetoArray3.getRangoValores());

		if (objetoArray1.equals(objetoArray2))
			System.out.println("Los arrays 1 y 2 son iguales.");
		else
			System.out.println("Los arrays 1 y 2 no son iguales.");

		if (objetoArray2.compareTo(objetoArray1) == 1)
			System.out.println("El array 2 es mayor que el array 1 segun el rango de valores.");
		else if (objetoArray2.compareTo(objetoArray1) == -1)
			System.out.println("El array 1 es mayor que el array 2 segun el rango de valores.");
		else
			System.out.println("Los arrays 1 y 2 son iguales segun el rango de valores.");

		if (objetoArray3.compareTo(objetoArray1) == 1)
			System.out.println("El array 3 es mayor que el array 1 segun el rango de valores.");
		else if (objetoArray3.compareTo(objetoArray1) == -1)
			System.out.println("El array 1 es mayor que el array 3 segun el rango de valores.");
		else
			System.out.println("Los arrays 1 y 3 son iguales segun el rango de valores.");

		ArrayEnteros objetoArray4 = new ArrayEnteros(objetoArray2);
		System.out.println("Array 4: " + objetoArray4.toString());

		if (objetoArray2.equals(objetoArray4))
			System.out.println("Los arrays 2 y 4 son iguales.");
		else
			System.out.println("Los arrays 2 y 4 no son iguales.");
		if (objetoArray4.compareTo(objetoArray2) == 1)
			System.out.println("El array 4 es mayor que el array 2 segun el rango de valores.");
		else if (objetoArray4.compareTo(objetoArray2) == -1)
			System.out.println("El array 2 es mayor que el array 4 segun el rango de valores.");
		else
			System.out.println("Los arrays 2 y 4 son iguales segun el rango de valores.");

	}
}
