package org.ip.tema03.ejemplostema;

import java.util.Scanner;

public class CocienteConIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca dos enteros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();

		if (num2 != 0)
			System.out.println(num1 + " / " + num2 + " es " + (num1 / num2));
		else
			System.out.println("No se puede hacer una division por cero");
		entrada.close();
	}
}
