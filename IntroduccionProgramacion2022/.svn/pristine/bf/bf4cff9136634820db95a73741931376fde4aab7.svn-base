package org.ip.tema04;

import org.ip.sesion07.Fraccion;

public class OtroTestArrayFracciones {

	public static void main(String[] args) {

		Fraccion [] arrayFracciones = new Fraccion[5];

		for (int i = 0; i < arrayFracciones.length; i++)
			arrayFracciones[i] = new Fraccion(i + 1, i + 2);

		for (int i = 0; i < arrayFracciones.length; i++)
			System.out.println(arrayFracciones[i].toString());

		int denominador = arrayFracciones[2].getDenominador();
		System.out.println("Denominador = " + denominador);

		Fraccion fraccionSuma = new Fraccion(0, 1);
		for (int i = 0; i < arrayFracciones.length; i++) {
			arrayFracciones[i].simplificar();
			fraccionSuma = fraccionSuma.sumar(arrayFracciones[i]);
		}
		System.out.println("Fraccion suma = " + (fraccionSuma.simplificar()).toString());
	}
}

