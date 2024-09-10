package org.ip.sesion03;

public class TrianguloRectanguloAsteriscos {

	public static void main(String[] args) {
		
		int lado = 7;
		
		do {
			System.out.println("Triangulo rectangulo de asteriscos de lado " + lado);
		} while(!(lado>3 && lado<15));
		System.out.println();
		
		for(int i=0;i<lado;i++) {
			for(int j=lado-i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
