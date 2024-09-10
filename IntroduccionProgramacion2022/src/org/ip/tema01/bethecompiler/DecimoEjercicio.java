package org.ip.tema01.bethecompiler;

public class DecimoEjercicio {

	public static void main(String[] args) {
		int lado = 9;
		if ((lado >= 3) && (lado < 10)) {
			for (int i = 0; i < lado; i++) {
				for (int j = 0; j < lado - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i + 1; j++) {
					System.out.print((i + 1) + " ");
				}
				System.out.println();
			}
			
			for (int i = 0; i < lado; i++) {
				for (int j = 0; j < lado - i; j++) {
					System.out.print((lado - i) + " ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("El lado del triangulo debe de estar entre 3 y 9");
		}
	}
}
