package org.ip.tema01.ejemplostema;

public class BuclesAnidadosDependientes {

	public static void main(String[] args) {

		for (int i = 1; (i <= 4); i++) {
			System.out.println("+ i = " + i);
			int j = 1;
			while (j <= i) {
				System.out.println(".. * j = " + j);
				j++;
			}
		}
		
	}
}
