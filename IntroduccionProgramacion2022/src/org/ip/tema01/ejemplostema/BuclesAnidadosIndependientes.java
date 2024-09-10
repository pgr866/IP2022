package org.ip.tema01.ejemplostema;

public class BuclesAnidadosIndependientes {

	public static void main(String[] args) {

		for (int i = 1; (i <= 4); i++) {
			System.out.println("+ " + i);
			for (int j = 1; (j <= 3); j++) {
				System.out.println(".. * " + j);
			}
		}
		
		System.out.println();

		for (int i = 1; (i <= 2); i++) {
			System.out.println("+ i = " + i);
			for (int j = 1; (j <= 3); j++) {
				System.out.println(".. * j = " + j);
				for (int k = 1; (k <= 4); k++) {
					System.out.println(".... - k = " + k);
				}
			}
		}

	}
}
