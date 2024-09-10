package org.ip.sesion05;

public class MatricesBinarias {
	
	public static boolean esBinaria(int [][] matriz) {
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if (!(matriz[i][j]==0 || matriz[i][j]==1)) {
					return false;
				}
			}
		}
		return true;
	}
	public static int [][] transformaBinaria(int [][] matriz) {
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j] = matriz[i][j]%2;
			}
		}
		return matriz;
	}
	public static int numeroDeUnos(int [][] matriz) {
		
		if (!MatricesBinarias.esBinaria(matriz)) {
			return -1;
		}
		
		int contarUnos = 0;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if (matriz[i][j]==1)
				contarUnos += 1;
			}
		}
		return contarUnos;
	}
	public static boolean tieneNumeroParCeros(int [][] matriz) {
		
		int contarCeros = 0;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if (matriz[i][j]==0)
				contarCeros += 1;
			}
		}
		if (contarCeros%2==0) {
			return true;
		} else {
			return false;
		}
	}
	public static int [] sumaFilas(int [][] matriz) {
		
		int[] sumaFilas = new int [matriz.length];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				sumaFilas[i] += matriz[i][j];
			}
		}
		return sumaFilas;
	}
	public static int [] sumaColumnas(int [][] matriz) {
		
		int[] sumaColumnas = new int [matriz[0].length];
		
		for(int i=0;i<matriz[0].length;i++) {
			for(int j=0;j<matriz.length;j++) {
				sumaColumnas[i] += matriz[j][i];
			}
		}
		return sumaColumnas;
	}
	public static int [] extraerFila(int [][] matriz, int numFila) {
		
		int[] fila = new int [matriz.length];
		
		for(int i=0;i<matriz[numFila].length;i++) {
			fila[i] = matriz[numFila][i];
		}
		return fila;
	}
	public static int [] extraerColumna(int [][] matriz, int numColumna) {
		int[] columna = new int [matriz.length];
		
		for(int i=0;i<matriz.length;i++) {
			columna[i] = matriz[i][numColumna];
		}
		return columna;
	}
	public static int [][] obtenerLaterales(int [][] matriz) {
		int[][] laterales = new int[4][matriz.length];
		
		for (int i=0;i<matriz[0].length;i++) {
			laterales[0][i] = matriz[0][i];
		}
		for (int i=0;i<matriz.length;i++) {
			laterales[1][i] = matriz[i][matriz[0].length-1];
		}
		for (int i=0;i<matriz[matriz.length-1].length;i++) {
			laterales[2][i] = matriz[matriz.length-1][i];
		}
		for(int i=0;i<matriz.length;i++) {
			laterales[3][i] = matriz[i][0];
		}
		return laterales;
	}
	public static void mostrarMatriz(int [][] matriz) {
		
		System.out.println("Matriz:");
		System.out.print("[");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ((i==matriz.length-1) && (j==matriz[i].length-1)) {
					System.out.print(matriz[i][j] + "]");
					System.out.println();
				} else if (j==matriz[i].length-1) {
					System.out.println(matriz[i][j]);
				} else {
					System.out.print(matriz[i][j] + "\t");
				}
			}
		}
	}
	public static void mostrarArray(int [] array) {
		System.out.print("Array: [");
		for (int i=0;i<array.length;i++) {
			if (i==array.length-1) {
				System.out.print(array[i] + "]");
			} else {
				System.out.print(array[i] + "\t");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		int [][] matriz = {
					{1, 3, 5, 7, 9},
					{12, 8, 37, 50, 11},
					{2, 4, 6, 8, 10},
					{77, 12, 21, 31, 28},
					{47, 2, 84, 87, 63}
			};
		
		MatricesBinarias.mostrarMatriz(matriz);
		if(MatricesBinarias.esBinaria(matriz)) {
			System.out.println("La matriz es binaria");
		} else {
			System.out.println("La matriz no es binaria");
		}
		System.out.print("Fila 2 => ");
		MatricesBinarias.mostrarArray(MatricesBinarias.extraerFila(matriz, 2));
		System.out.print("Columna 3 => ");
		MatricesBinarias.mostrarArray(MatricesBinarias.extraerColumna(matriz, 3));
		System.out.print("Suma de las filas => ");
		MatricesBinarias.mostrarArray(MatricesBinarias.sumaFilas(matriz));
		System.out.print("Suma de las columnas => ");
		MatricesBinarias.mostrarArray(MatricesBinarias.sumaColumnas(matriz));
		if(!MatricesBinarias.esBinaria(matriz)) {
			System.out.println("Transformando la matriz de enteros en matriz binaria ...");
			MatricesBinarias.mostrarMatriz(MatricesBinarias.transformaBinaria(matriz));
			if(MatricesBinarias.esBinaria(MatricesBinarias.transformaBinaria(matriz))) {
				System.out.println("La matriz es binaria");
			} else {
				System.out.println("La matriz no es binaria");
			}
			System.out.println("El numero de 1s es: " + MatricesBinarias.numeroDeUnos(matriz));
			if (MatricesBinarias.tieneNumeroParCeros(MatricesBinarias.transformaBinaria(matriz))) {
				System.out.println("La matriz binaria tiene un numero par de ceros");
			} else {
				System.out.println("La matriz binaria tiene un numero impar de ceros");
			}
			System.out.print("Fila 3 => ");
			MatricesBinarias.mostrarArray(MatricesBinarias.extraerFila(MatricesBinarias.transformaBinaria(matriz), 3));
			System.out.print("Columna 2 => ");
			MatricesBinarias.mostrarArray(MatricesBinarias.extraerColumna(MatricesBinarias.transformaBinaria(matriz), 2));
			System.out.print("Suma de las filas => ");
			MatricesBinarias.mostrarArray(MatricesBinarias.sumaFilas(MatricesBinarias.transformaBinaria(matriz)));
			System.out.print("Suma de las columnas => ");
			MatricesBinarias.mostrarArray(MatricesBinarias.sumaColumnas(MatricesBinarias.transformaBinaria(matriz)));
			System.out.print("Laterales => ");
			MatricesBinarias.mostrarMatriz(MatricesBinarias.obtenerLaterales(MatricesBinarias.transformaBinaria(matriz)));
		}
	}
}
