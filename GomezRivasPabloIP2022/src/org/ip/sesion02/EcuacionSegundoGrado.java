package org.ip.sesion02;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 1;
		double discriminante = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("SOLUCION DE UNA ECUACION DE SEGUNDO GRADO");
		System.out.println();
		System.out.println("Valores de los coeficientes");
		System.out.println();
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println();
		if (a == 0) {
			System.out.println("No es una ecuacion de segundo grado");
		} else if (discriminante < 0) {
			System.out.println("No tiene solucion real");
		} else if (discriminante == 0) {
			System.out.println("Una unica raiz de valor doble");
			double solucion = (-b / (2 * a));
			System.out.println("x = " + solucion);
		} else if (discriminante > 0) {
			System.out.println("Dos raices de valores");
			double solucion1 = ((-b + Math.sqrt(discriminante)) / (2 * a));
			double solucion2 = ((-b - Math.sqrt(discriminante)) / (2 * a));
			System.out.println("x1 = " + solucion1);
			System.out.println("x2 = " + solucion2);
		}
		
	}

}
