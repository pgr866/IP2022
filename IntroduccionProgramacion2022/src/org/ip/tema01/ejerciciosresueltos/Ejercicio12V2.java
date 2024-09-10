package org.ip.tema01.ejerciciosresueltos;

public class Ejercicio12V2 {

	/**
	 * Muestra si un entero positivo es primo
	 * @param args
	 */
	public static void main(String[] args) {
		int dato = 9;
		int divisor = 2;
		boolean primo = true;
		while (primo && divisor < dato){
			if (dato % divisor == 0)
				primo = false;
			divisor++;
		}
		if (primo)
			System.out.println("El numero es primo");
		else
			System.out.println("El numero no es primo");
	}
}
