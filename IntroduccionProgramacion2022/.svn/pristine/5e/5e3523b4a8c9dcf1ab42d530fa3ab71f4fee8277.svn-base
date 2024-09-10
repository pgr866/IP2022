package org.ip.tema04;

import org.ip.sesion07.Complejo;

public class OtroTestMatrizComplejos {

	public static void main(String[] args) {

		Complejo [][] matrizComplejos = new Complejo[3][3];

		for (int i = 0; i < matrizComplejos.length; i++) {
			for (int j = 0; j < matrizComplejos[i].length; j++) {
				matrizComplejos[i][j] = new Complejo(i + 1, i + 2);
			}
		}

		for (int i = 0; i < matrizComplejos.length; i++) {
			for (int j = 0; j < matrizComplejos[i].length; j++) {
				if (j != matrizComplejos[i].length - 1)
					System.out.print("MatrizComplejos[" + i + "][" + j + "] = " + matrizComplejos[i][j].toString() + ", ");
				else
					System.out.print("MatrizComplejos[" + i + "][" + j + "] = " + matrizComplejos[i][j].toString());
			}
			System.out.println();
		}

		System.out.println(matrizComplejos[1][2].conjugado().toString());
	}
}

