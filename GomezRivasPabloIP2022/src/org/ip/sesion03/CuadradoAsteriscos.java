package org.ip.sesion03;

public class CuadradoAsteriscos {

	public static void main(String[] args) {
		
		int lado = 7;
		
		do {
			System.out.println("Cuadrado de asteriscos de lado " + lado);
		} while (!(lado>0));
		System.out.println();
		
		for (int i=1;i<=lado;i++) {
			for (int j=1;j<=lado;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}
