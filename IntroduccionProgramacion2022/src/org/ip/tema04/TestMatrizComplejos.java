package org.ip.tema04;

import org.ip.sesion07.Complejo;

public class TestMatrizComplejos {

	public static void main(String[] args) {

		Complejo [][] matrizComplejos = new Complejo[2][2];

		matrizComplejos[0][0] = new Complejo(2.5, 5.5);
		matrizComplejos[0][1] = new Complejo(-3.5, 1.0);
		matrizComplejos[1][0] = new Complejo(1.5, 7.5);
		matrizComplejos[1][1] = new Complejo(1.0, 5.0);

		Complejo complejoSuma = new Complejo(0, 0);
		Complejo complejoProducto = new Complejo(1, 0);
		for (int i = 0; i < matrizComplejos.length; i++) {
			for (int j = 0; j < matrizComplejos[i].length; j++) {
				if (j != matrizComplejos[i].length - 1)
					System.out.print("MatrizComplejos[" + i + "][" + j + "] = " + matrizComplejos[i][j].toString() + ", ");
				else
					System.out.print("MatrizComplejos[" + i + "][" + j + "] = " + matrizComplejos[i][j].toString());
				complejoSuma = complejoSuma.sumar(matrizComplejos[i][j]);
				complejoProducto = complejoProducto.multiplicar(matrizComplejos[i][j]);
			}
			System.out.println();
		}
		System.out.println("Complejo suma de toda la matriz = " + complejoSuma.toString());
		System.out.println("Modulo del complejo suma: " + complejoSuma.modulo());
		System.out.println("Argumento del complejo suma: " + complejoSuma.argumento());
		System.out.println("Complejo producto de toda la matriz = " + complejoProducto.toString());
	}
}
