package org.ip.tema01.ejemplostema;

public class BucleFor {

	public static void main(String[] args) {
		int v = 1;
		int N = 10;
		int i;
		
		for (i = 0; i <= N; i++) {
			System.out.println(i + "  " + v);
			v = 2 * v;
		}
		System.out.println("Fuera del bucle: i = " + i + " , v = " + v);

		System.out.println();
		
		v = (int)Math.pow(2.0, (double)N); // v / 2;
		for (i = N; i >= 0; i--) {
			System.out.println(i + "  " + v);
			v = v / 2;
		}
		System.out.println("Fuera del bucle: i = " + i + " , v = " + v);

	}
	
}
