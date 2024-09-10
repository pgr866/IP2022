package org.ip.tema01.bethecompiler;

public class QuintoEjercicio {

	public static void main(String[] args) {
		int row = 10;
		int column = 0;

		while (row >= 1) {
			column = 1;
			while (column <= row) {
				System.out.print(row % 2 == 1 ? "<" : ">");
				++column;
			}
			--row;
			System.out.println();
		}

		//System.out.println("row = " + row + ", column = " + column);

		System.out.println();
		row += 5; //5
		column += 1; //3
		//System.out.println("row = " + row + ", column = " + column);
		if (row++ / 2 < column && (row++ / 2 > column || (row * 2 < column * 4)))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
