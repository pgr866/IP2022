package org.ip.tema01.ejerciciosresueltos;

 /*******************************************
 * Obtiene la ecuacion de la recta que pasa por dos puntos (x1, y1) y (x2, y2)
 * y = ax + b
 * 
 */

public class EcuacionRecta {

	public static void main(String[] args) {

		int x1 = 0;
		int x2 = 1;
		int y1 = 1;
		int y2 = 4;
		double a;
		double b;
		System.out.println();
		System.out.println("CALCULO DE LA ECUACION DE LA RECTA QUE PASA POR DOS PUNTOS");
		System.out.println();
		if ((x1 == x2) && (y1 == y2)) {
			System.out.println("Los dos puntos (" + x1 + ","
							+ y1 + ") y (" + x2 + "," + y2
							+ ") COINCIDEN, no se puede obtener la ecuacion de la recta");
		} else {
			System.out.println("Ecuacion de la recta que pasa por ("
					+ x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") \n");
			if (x1 == x2) {
				System.out.println("x = " + x1);
			} else if (y1 == y2) {

				System.out.println("y = " + y1);
			} else {
				a = (double) (y1 - y2) / (x1 - x2);
				b = y1 - ((double) (y1 - y2) / (x1 - x2)) * x1;
				if (b == 0) {
					System.out.println("y = " + a + "x ");
				} else if (b > 0) {
					System.out.println("y = " + a + "x + " + b);
				} else {
					System.out.println("y = " + a + "x - " + -b);
				}
			}
		}
	}
}
