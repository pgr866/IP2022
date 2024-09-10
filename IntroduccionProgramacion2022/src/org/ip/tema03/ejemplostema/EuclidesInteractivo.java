package org.ip.tema03.ejemplostema;

import java.util.Scanner;

public class EuclidesInteractivo {

	private static Scanner entrada;

	public static int mcdEuclides(int dato1, int dato2) {
		int aux;
		while (dato1 % dato2 != 0) {
			aux = dato1;
			dato1 = dato2;
			dato2 = aux % dato1;
		}
		return dato2;
	}

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		System.out.println("Introduzca el primer valor");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca el segundo valor");
		int dato2 = entrada.nextInt();
		System.out.println("El MCD de " + dato1 + " y " + dato2 + " es "
				+ mcdEuclides(dato1, dato2));
	}
}
