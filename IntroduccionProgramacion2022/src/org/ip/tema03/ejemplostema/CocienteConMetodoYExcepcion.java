package org.ip.tema03.ejemplostema;

import java.util.Scanner;

public class CocienteConMetodoYExcepcion {

	public static int cociente(int numero1, int numero2) throws ArithmeticException {
		if (numero2 == 0)
			// Se lanza la excepcion
			throw new ArithmeticException("No se puede dividir por cero");
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
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			ex.printStackTrace();
		}
		System.out.println("La ejecucion continua ...");
		System.out.println("El producto de los valores es: " + (num1 * num2));
		entrada.close();
	}
}
