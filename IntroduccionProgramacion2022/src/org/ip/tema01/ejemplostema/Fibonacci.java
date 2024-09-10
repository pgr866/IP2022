package org.ip.tema01.ejemplostema;

import java.util.Scanner;

public class Fibonacci {

	// Metodo iterativo para calcular el numero de fibonacci
	public static long fibonacciIterativo(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			int fiMenosDos = 0;  // f0
			int fiMenosUno = 1;  // f1
			int i = 2;
			int fi = fiMenosUno + fiMenosDos;
			while (i < n) {
				fiMenosDos = fiMenosUno;
				fiMenosUno = fi;
				fi = fiMenosUno + fiMenosDos;
				i++;
			}
			return fi;
		}
	}

	// Metodo recursivo para calcular el numero de fibonacci
	public static long fibonacciRecursivo(int n) {
		if (n == 0)			// Caso base
			return 0;
		else if (n == 1)	// Caso base
			return 1;
		else
			// Reduccion y llamada recursiva
			return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce el indice para obtener el numero de Fibonacci: ");
		int indice = entrada.nextInt();
		System.out.println("El numero de Fibonacci (R) para el indice " + indice
				+ " es " + fibonacciRecursivo(indice));
		System.out.println("El numero de Fibonacci (I) para el indice " + indice
				+ " es " + fibonacciIterativo(indice));
		int terminos; // numero de terminos a mostrar
		System.out.print("Indica el numero de terminos que desea mostrar de la serie de Fibonacci: ");
		terminos = entrada.nextInt();
		for (int i = 0; (i < terminos); i++) {
			System.out.print(fibonacciRecursivo(i) + "\t");
		}
		System.out.println();
		for (int i = 0; (i < terminos); i++) {
			System.out.print(fibonacciIterativo(i) + "\t");
		}
	}
}
