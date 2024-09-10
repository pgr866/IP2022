package org.ip.tema02;

import java.util.Scanner;

public class Ejemplo2Array {

	public static double media(int [] array, int inferior, int superior) {
		if (inferior < 0 || superior >= array.length || inferior > superior)
			throw new RuntimeException("Indices de array, fuera de rango");
		double suma = 0.0;
		int componentes = superior - inferior + 1;
		for (int i = inferior; i <= superior; i++) {
			suma += (double)array[i];
		}
		return suma / componentes;
	}

	public static void main(String[] args) {
		int [] temperaturas = {5, 10, 25, -4, 3};
		Scanner entrada = new Scanner(System.in);
		int inferior = 0, superior = 0;
		double valorMedio = 0.0;
		boolean indicesCorrectos = false;
		while (!indicesCorrectos) {
			try {
				System.out.println("Introduce indices inferior y superior"
						+ " para calcular la media del subarray");
				inferior = entrada.nextInt();
				superior = entrada.nextInt();
				valorMedio = media(temperaturas, inferior, superior);
				indicesCorrectos = true;
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("La media del subarray es: " + valorMedio);
		entrada.close();
	}
}
