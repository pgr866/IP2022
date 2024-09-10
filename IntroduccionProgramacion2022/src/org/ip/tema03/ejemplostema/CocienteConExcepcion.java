package org.ip.tema03.ejemplostema;

import java.util.Scanner;

public class CocienteConExcepcion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca dos enteros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		try {
			System.out.println(num1 + " / " + num2 + " es " + (num1 / num2));
		} catch (Exception ex) {
			System.out.println("Excepcion: un entero "
					+ "no se puede dividir por cero");
		}
		System.out.println("La ejecucion continua ...");
		entrada.close();
	}
}
