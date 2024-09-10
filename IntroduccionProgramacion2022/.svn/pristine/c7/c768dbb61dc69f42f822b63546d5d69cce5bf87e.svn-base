package org.ip.tema02;

import java.util.Scanner;

public class PasandoDevolviendoMatricesMetodos {

	public static void main(String[] args) {
		int[][] matriz = getMatriz();
		System.out.println("\nLa suma de todos los elementos es " + suma(matriz));
	}

	public static int[][] getMatriz() {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][4];
		System.out.println("Introduce " + matriz.length + " filas and "
			+ matriz[0].length + " columnas: ");
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				matriz[i][j] = entrada.nextInt();
		entrada.close();
		return matriz;
	}

	public static int suma(int[][] matriz) {
		int sumaTotal = 0;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				sumaTotal += matriz[fila][columna];
			}
		}
		return sumaTotal;
	}
}
