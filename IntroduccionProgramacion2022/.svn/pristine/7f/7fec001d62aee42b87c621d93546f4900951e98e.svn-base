package org.ip.tema01.ejemplostema;

public class Factorial {
	
	// Metodo iterativo para calcular el factorial
	public static long factorialIterativo(int n){
		if (n == 0) return 1;
		long fact = 1;
		int i = 1;
		while (i <= n) {
			fact = fact * i;
			i++;
		}
		return fact;
	}

	// Metodo recursivo para calcular el factorial
	public static int factorialRecursivo(int n){
		if (n == 0)
			return 1;
		else
			return n * factorialRecursivo(n - 1);
	}

	// Metodo recursivo erroneo para calcular el factorial
	public static int factorialRecursivoErroneo(int n){
		return n * factorialRecursivoErroneo(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("El factorial recursivo de 7 es " + factorialRecursivo(7));
		System.out.println("El factorial iterativo de 7 es " + factorialIterativo(7));
		//System.out.println("El factorial recursivo de 7 es " + factorialRecursivoErroneo(7));
	}
}
