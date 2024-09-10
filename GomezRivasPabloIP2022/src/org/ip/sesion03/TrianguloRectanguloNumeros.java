package org.ip.sesion03;

public class TrianguloRectanguloNumeros {

	public static void main(String[] args) {
		
		int lado = 10;
		
		do {
			System.out.println("Triangulo rectangulo de numeros para un valor de lado = " + lado);
		} while (!(lado>0 && lado<=10));
		System.out.println();
		
		for(int i=1;i<=lado;i++) {
			for(int j=lado-i;j>0;j--) {
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			System.out.print((k-1) + " ");
			System.out.println();
		}
	}
}
