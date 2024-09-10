package org.ip.tema01.ejemplostema;

public class Potencia {

	public static double potencia(int base, int exponente) {
		if (exponente == 0) {         // caso base
			return 1.0;               // base^0 = 1
		} else if (exponente == 1) {  // caso base
			return (double)base;      // bas^1 = base
		} else if (exponente < 0) {   // exponente negativo
			return potencia(base, exponente + 1) / base;
		} else {                      // exponente positivo
			return base * potencia(base, exponente - 1);
		}
	}

	public static void main(String[] args) {
		int base = 10;
		int exponente1 = 4;
		int exponente2 = -3;
		
		System.out.println(base + "^" + exponente1 + " = " + potencia(base, exponente1));
		System.out.println(base + "^" + exponente2 + " = " + potencia(base, exponente2));

	}
}
