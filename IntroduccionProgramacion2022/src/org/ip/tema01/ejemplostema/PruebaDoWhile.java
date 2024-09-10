package org.ip.tema01.ejemplostema;

import java.util.Scanner;

public class PruebaDoWhile {

	public static void main(String[] args) {
		int dato;
		int suma = 0;
		
		// Crear un scanner para leer datos de entrada
		Scanner entrada = new Scanner(System.in);
		
		// Continuar leyendo hasta que la entrada sea 0
		do {
			// Leer los datos siguientes
			System.out.println("Introduce un entero (la entrada termina con 0): ");
			dato = entrada.nextInt();
			
			suma += dato;
		} while (dato != 0);

		System.out.println("La suma es: "+  suma);
		
		entrada.close();
	}
}
