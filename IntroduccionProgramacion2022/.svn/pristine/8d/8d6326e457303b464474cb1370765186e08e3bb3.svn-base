package org.ip.tema04;

public class MatrizSimetrica {

	public static boolean esSimetrica(int [][] matriz) {
		boolean simetrica = true;
		int fila = 0;
		int columna;
		while (simetrica && (fila < matriz.length)) {
			columna = 0;
			while (simetrica && (columna < matriz[fila].length)) {
				if (matriz[fila][columna] != matriz[columna][fila])
					simetrica = false;
				columna++;
			}
			fila++;
		}
		return simetrica;
	}
	public static void main(String[] args) {
		int [][] matriz = {{1, 2, 3}, {2, 1, 4}, {3, 4, 1}};
		boolean simetrica = esSimetrica(matriz);
		if (simetrica)
			System.out.println("La matriz es simetrica");
		else
			System.out.println("La matriz no es simetrica");
	}
}
