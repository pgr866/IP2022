package org.ip.sesion03;

import java.util.Scanner;

public class Euclides {

	public static void main(String[] args) {
		
		int x;
		int y;
		int r=1;

		do {
			System.out.println("Introduce el primer valor entero positivo");
			Scanner entrada=new Scanner(System.in);
			x = entrada.nextInt();
			entrada.close();
		} while (x<=0);
		int num1 = x;
		do {
			System.out.println("Introduce el segundo valor entero positivo");
			Scanner entrada=new Scanner(System.in);
			y = entrada.nextInt();	
			entrada.close();
		} while (y<=0);
		int num2 = y;
		
		@SuppressWarnings("unused")
		int q;
		while (r!=0) {
			q = (int) x/y;
			r = x % y;
			x = y;
			y = r;
		}
		
		System.out.println("El MCD de " + num1 + " y " + num2 + " es " + x);
	}
}
