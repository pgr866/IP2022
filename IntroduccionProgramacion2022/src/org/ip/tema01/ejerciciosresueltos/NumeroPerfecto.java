package org.ip.tema01.ejerciciosresueltos;

import java.util.Scanner;

public class NumeroPerfecto {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduzca un numero entero positivo para saber si es perfecto");
			int dato = entrada.nextInt();
			int suma = 1;
			for (int i = 2; i < dato; i++) {
				if (dato % i == 0) {
					suma += i;
				}
			}
			
			if (suma == dato)
				System.out.println("El numero es perfecto");
			else
				System.out.println("El numero no es perfecto");
			
			entrada.close();
	}
}
