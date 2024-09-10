package org.ip.tema01.bethecompiler;

public class SeptimoEjercicio {

	public static void main(String[] args) {
		int side = 13;
		int i = 0, j = 0;

		for (i = 0; (i < (side + 1) / 2); i++) {
			for (j = 0; (j < i); j++) {
				System.out.print("  ");
			}
			for (j = 0; (j < (side / 2 - i) * 2 + 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		i -= 2;
		j += 2;
		if (++i / 2 < ++j && (i++ / 2 > --j || (--i - 2 < j + 1)))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");		
	}
}
