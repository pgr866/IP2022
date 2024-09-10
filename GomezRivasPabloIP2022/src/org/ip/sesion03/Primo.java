package org.ip.sesion03;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		
		int dato;
		Scanner entrada=new Scanner(System.in);
		
		do {
			System.out.print("Introduce un numero (>1) para saber si es primo: ");
			dato = entrada.nextInt();
		} while (dato<=1);
		
		double raiz = Math.sqrt(dato);
		int resto=1;
		
		if (dato % 2 == 0) {
			resto = 0;
			if (dato == 2) {
				resto = 1;
			}
		} else {
			for (int i=3;resto!=0 && i<=raiz;i=i+2) {
				resto = (int) (dato%i);
			}
		}
		if (resto==0) {
			System.out.println("NO ES PRIMO");	
		} else {
			System.out.println("ES PRIMO");
		}
		
		entrada.close();
	}
}
