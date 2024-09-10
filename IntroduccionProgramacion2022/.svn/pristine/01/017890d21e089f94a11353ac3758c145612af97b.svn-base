package org.ip.tema01.bethecompiler;

public class NovenoEjercicio {

	public static void main(String[] args) {
		int row = 10;
		int column = 0;
		while (row >= 1) {
			System.out.print(row + " => ");
			column = 1;
			while (column <= row) {
				System.out.print((row % 2 == 0 ? column : row) + " ");
				++column;
			}
			--row;
			System.out.println();
		}
		
		System.out.println();
		row += 5;
		column += 1;
		if (row++ / 2 < column && (row++ / 2 > column || (row * 2 < column * 4)))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
