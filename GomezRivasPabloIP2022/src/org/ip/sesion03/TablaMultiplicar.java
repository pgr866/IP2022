package org.ip.sesion03;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		
		int numero;
		
		do {
			System.out.print("Introduzca un numero (de 1 a 10): ");
			Scanner entrada=new Scanner(System.in);
			numero = entrada.nextInt();
			entrada.close();
		} while (!(numero >= 1 && numero <= 10));
		
		System.out.println("Tabla del " + numero);
		
		for (int i = 1;i<=10;i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);	
		}
	}
}
