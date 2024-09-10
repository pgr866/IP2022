package org.ip.sesion07;

import java.util.Scanner;

public class TestFraccion {
	
	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Cuantas operaciones de fracciones deseas realizar?");
		int n = entrada.nextInt();
		for(int i = 1;i<=n;i++) {
			System.out.println("Comparacion " + i);
			System.out.println("Introduce numerador y denominador de la primera fraccion");
			int num1 = entrada.nextInt();
			int den1 = entrada.nextInt();
			Fraccion frac1 = new Fraccion(num1, den1);
			
			
			System.out.println("Introduce numerador y denominador de la segunda fraccion");
			int num2 = entrada.nextInt();
			int den2 = entrada.nextInt();
			Fraccion frac2 = new Fraccion(num2, den2);
			
			if(frac1.compareTo(frac2) == 0) {
				System.out.println(frac1 + " es igual que " + frac2);
			} else if(frac1.compareTo(frac2) == 1) {
				System.out.println(frac1 + " es mayor que " + frac2);
			} else {
				System.out.println(frac1 + " es menor que " + frac2);
			}
			System.out.println();
		}
		entrada.close();
	}
	
}
