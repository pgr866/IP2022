package org.ip.tema04;

import org.ip.sesion07.Fraccion;

public class TestArrayFracciones {

	public static void main(String[] args) {

		Fraccion [] arrayFracciones = new Fraccion[5];

		arrayFracciones[0] = new Fraccion(8, 9);
		arrayFracciones[1] = new Fraccion(11, -22);
		arrayFracciones[2] = new Fraccion(3, 9);
		arrayFracciones[3] = new Fraccion(3, 9).simplificar();
		arrayFracciones[4] = new Fraccion(1, 2);

		Fraccion fraccionSuma = new Fraccion(0, 1);
		Fraccion fraccionProducto = new Fraccion(1, 1);
		for (int i = 0; i < arrayFracciones.length; i++) {
			arrayFracciones[i].simplificar();
			System.out.println("ArrayFracciones[" + i + "] = " + arrayFracciones[i].toString());
			fraccionSuma = fraccionSuma.sumar(arrayFracciones[i]);
			fraccionProducto = fraccionProducto.multiplicar(arrayFracciones[i]);
		}

		System.out.println("Fraccion suma = " + (fraccionSuma.simplificar()).toString());
		System.out.println("Fraccion producto = " + (fraccionProducto.simplificar()).toString());

		if (arrayFracciones[2].equals(arrayFracciones[3]))
			System.out.println("Las fracciones: " + arrayFracciones[2] + " y " + arrayFracciones[3] + " son iguales");
		else
			System.out.println("Las fracciones: " + arrayFracciones[2] + " y " + arrayFracciones[3] + " NO son iguales");

		if (arrayFracciones[3].compareTo(arrayFracciones[4]) == 1)
			System.out.println("La fraccion: " + arrayFracciones[3] + " es mayor que la fraccion " + arrayFracciones[4]);
		else if (arrayFracciones[3].compareTo(arrayFracciones[4]) == -1)
			System.out.println("La fraccion: " + arrayFracciones[3] + " es menor que la fraccion " + arrayFracciones[4]);
		else
			System.out.println("Las fracciones: " + arrayFracciones[3] + " y " + arrayFracciones[4] + " son iguales");
	}
}
