package org.ip.tema01.bethecompiler;

public class SextoEjercicio {

	public static void main(String[] args) {
		int side = 11;
		int i = 0, j = 0;

		for (i = 0; (i < (side + 1) / 2); i++) {
			for (j = 0; (j < (side + 1) / 2 - i - 1); j++) {
				System.out.print("  ");
			}
			for (j = 0; (j < 2 * i + 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		i += 9;
		j -= 1;
		if (j + 4 < i-- - 3 || 2 * 5 + 1 > i - 2 * 2)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
