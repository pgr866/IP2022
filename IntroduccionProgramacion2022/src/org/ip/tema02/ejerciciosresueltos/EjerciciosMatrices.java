package org.ip.tema02.ejerciciosresueltos;

public class EjerciciosMatrices {

	public static void mostrarMatrizEnteros(int [][] matriz) {
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j != matriz[i].length - 1)
					System.out.print(matriz[i][j] + "\t");
				else
					System.out.print(matriz[i][j]);
			}
			if (i != matriz.length - 1)
				System.out.println();
		}
	}

	public static void mostrarMatrizReales(double [][] matriz) {
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j != matriz[i].length - 1)
					System.out.print(matriz[i][j] + "\t");
				else
					System.out.print(matriz[i][j]);
			}
			if (i != matriz.length - 1)
				System.out.println();
		}
	}

	public static void completarMatrizPorFilas(int [][] matriz) {
		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = k++;
			}
		}
	}
	
	public static void completarMatrizPorColumnas(int [][] matriz) {
		int k = 0;
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				matriz[i][j] = k++;
			}
		}
	}

	public static double obtenerSumaElementosMatriz(double [][] matriz) {
		double sumaTotal = 0.0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				sumaTotal += matriz[i][j];
			}
		}
		return sumaTotal;
	}
	
	public static double [][] matrizMultiplicada(double [][] matriz, double valor) {
		double [][] matrizMultiplicada = new double[matriz.length][matriz[0].length];
		for (int i = 0; i < matrizMultiplicada.length; i++) {
			for (int j = 0; j < matrizMultiplicada[i].length; j++) {
				matrizMultiplicada[i][j] = matriz[i][j] * valor;
			}
		}
		return matrizMultiplicada;
	}
	
	public static void mostrarMatrizIrregular() {
		int [][] matrizIrregular = {{1, 2, 3, 4, 5},
				{1, 2, 3, 4},
				{1, 2, 3},
				{1, 2},
				{1}};
		
		for (int i = 0; i < matrizIrregular.length; i++) {
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.print(matrizIrregular[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static int [][] generarMatrizIdentidad(int dimension) {
		int [][] matrizIdentidad = new int[dimension][dimension];
		for (int i = 0; i < matrizIdentidad.length; i++) {
			for (int j = 0; j < matrizIdentidad[i].length; j++) {
				if (i == j)
					matrizIdentidad[i][j] = 1;
				else
					matrizIdentidad[i][j] = 0;
				//matrizIdentidad[i][j] = (i == j) ? 1 : 0;
			}
		}
		//for (int i = 0; i < dimension; i++)
		//	matrizIdentidad[i][i] = 1;
		return matrizIdentidad;
	}
	
	public static int [][] obtenerDiagonales(int [][] matriz) {
		if ((matriz == null) || (matriz.length != matriz[0].length))
			throw new IllegalArgumentException("Argumento no valido");
		int [][] matrizDiagonales = new int[2][matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j)
					matrizDiagonales[0][j] = matriz[i][j];
				if (matriz.length - 1 - i == j)
					matrizDiagonales[1][j] = matriz[i][j];
			}
		}
		//for (int i = 0, j = 0; i < matriz.length; i++, j++) {
		//	matrizDiagonales[0][j] = matriz[i][j];
		//	matrizDiagonales[1][j] = matriz[matriz.length - 1 - i][j];
		//}
		return matrizDiagonales;
	}
	
	public static void filaConMayorSuma(int [][] matriz) {
		int maxSumaFila = 0;
		int indiceMaxSumaFila = 0;
		for (int columna = 0; columna < matriz[0].length; columna++) {
			maxSumaFila += matriz[0][columna];
		}
		for (int fila = 1; fila < matriz.length; fila++) {
			int sumaFilaActual = 0;
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				sumaFilaActual += matriz[fila][columna];
			}
			if (sumaFilaActual > maxSumaFila) {
				maxSumaFila = sumaFilaActual;
				indiceMaxSumaFila = fila;
			}
		}
		System.out.println("Fila " + indiceMaxSumaFila + " tiene la maxima suma de " + maxSumaFila);		
	}

	public static void filaConMayorSumaOtroMetodo(int [][] matriz) {
		int maxSumaFila = Integer.MIN_VALUE;
		int indiceMaxSumaFila = 0;
		for (int fila = 0; fila < matriz.length; fila++) {
			int sumaFilaActual = 0;
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				sumaFilaActual += matriz[fila][columna];
			}
			if (sumaFilaActual > maxSumaFila) {
				maxSumaFila = sumaFilaActual;
				indiceMaxSumaFila = fila;
			}
		}
		System.out.println("Fila " + indiceMaxSumaFila + " tiene la maxima suma de " + maxSumaFila);		
	}

	public static void columnaConMayorSuma(int [][] matriz) {
		int maxSumaColumna = Integer.MIN_VALUE;
		int indiceMaxSumaColumna = 0;
		for (int columna = 0; columna < matriz[0].length; columna++) {
			int sumaColumnaActual = 0;
			for (int fila = 0; fila < matriz.length; fila++) {
				sumaColumnaActual += matriz[fila][columna];
			}
			if (sumaColumnaActual > maxSumaColumna) {
				maxSumaColumna = sumaColumnaActual;
				indiceMaxSumaColumna = columna;
			}
		}
		System.out.println("Columna " + indiceMaxSumaColumna + " tiene la maxima suma de " + maxSumaColumna);		
	}

	public static void main(String[] args) {
		double [][] matrizReales = {
				{3.39, 37.74, 8.02, 30.49, 20.04},
				{5.12, 7.76, 89.20, 31.05, 81.28},
				{39.37, 23.67, 14.29, 47.62, 23.58},
				{56.88, 10.29, 6.00, 9.24, 94.68},
				{57.80, 68.51, 63.06, 78.11, 21.22},
		};
		int [][] matrizEnteros = {
				{3, 37, 8, 30, 20},
				{5, 7, 89, 31, 81},
				{39, 23, 14, 47, 23},
				{56, 10, 6, 9, 94},
				{57, 68, 63, 78, 21},
		};

		// Ejercicio 4
		//int [][] matriz = new int[5][5];
		//completarMatrizPorFilas(matriz);
		//mostrarMatrizEnteros(matriz);
		//System.out.println();
		//completarMatrizPorColumnas(matriz);
		//mostrarMatrizEnteros(matriz);
		
		// Ejercicio 5
		//System.out.println("La suma de los elementos de la matriz es: " + obtenerSumaElementosMatriz(matrizReales));
		
		// Ejercicio 6
		//double [][] matrizMultiplicada = matrizMultiplicada(matrizReales, 2.0);
		//mostrarMatrizReales(matrizMultiplicada);
		
		// Ejercicio 7
		//mostrarMatrizIrregular();

		// Ejercicio 8
		//int [][] matrizIdentidad = generarMatrizIdentidad(6);
		//mostrarMatrizEnteros(matrizIdentidad);
		
		// Ejercicio 9
		//int [][] matrizDiagonales = obtenerDiagonales(matrizEnteros);
		//mostrarMatrizEnteros(matrizDiagonales);
		
		// Ejercicio 10
		filaConMayorSuma(matrizEnteros);
		filaConMayorSumaOtroMetodo(matrizEnteros);
		columnaConMayorSuma(matrizEnteros);
		
	}
}
