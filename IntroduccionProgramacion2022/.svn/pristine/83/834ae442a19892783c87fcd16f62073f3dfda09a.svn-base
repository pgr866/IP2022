package org.ip.tema03.ejemplostema;

import java.util.Scanner;

public class CocienteConMetodo {
	public static int cociente(int numero1, int numero2) {
		return numero1 / numero2;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca dos enteros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		try {
			int resultado = cociente(num1, num2);
			System.out.println(num1 + " / " + num2 + " es "
			+ resultado);
		} catch (Exception ex) {
			System.out.println("Excepcion: un entero "
					+ "no se puede dividir por cero");
		}
		System.out.println("La ejecucion continua ...");
		entrada.close();
	}
}
