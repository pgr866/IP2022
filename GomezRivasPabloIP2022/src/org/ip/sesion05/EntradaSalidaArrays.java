package org.ip.sesion05;

import java.util.Scanner;

public class EntradaSalidaArrays {
	
	public static double[] leerRealesArray1D() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array de reales");
		int numElementos = entrada.nextInt();
		double [] array = new double [numElementos];
		System.out.println("Introduce valores reales en el array ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + " => ");
			array[i] = entrada.nextDouble();
		}
		return array;
	}
	public static int [] leerEnterosArray1D() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array de enteros");
		int numElementos = entrada.nextInt();
		int [] array = new int [numElementos];
		System.out.println("Introduce valores enteros en el array");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + " => ");
			array[i] = entrada.nextInt();
		}
		return array;
	}
	public static int [] inicializarEnterosArray1D() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array de enteros aleatorios");
		int numElementos = entrada.nextInt();
		int [] array = new int [numElementos];
		
		for (int i = 0; i<array.length; i++) {
			array[i] = (int) (Math.random()*100);
		}
		return array;
	}
	public static double [] inicializarRealesArray1D() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de componentes del array de reales aleatorios");
		int numElementos = entrada.nextInt();
		double [] array = new double [numElementos];
		
		for (int i = 0; i<array.length; i++) {
			array[i] = Math.random()*100;
		}
		return array;
	}
	public static void mostrarArray1D(double [] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	public static void mostrarArray1D(int [] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	public static int [][] leerEnterosMatriz2D() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de filas de la matriz de enteros");
		int filas = entrada.nextInt();
		System.out.println("Introduce el número de columnas de la matriz de enteros");
		int columnas = entrada.nextInt();
		int [][] matriz = new int [filas][columnas];
		System.out.println("Introduce valores enteros en la matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Introduce valor " + (i + 1) + "," + (j+1) + " => ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		return matriz;
	}
	public static int [][] inicializarEnterosMatriz2D() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de filas de la matriz de enteros aleatorios");
		int filas = entrada.nextInt();
		System.out.println("Introduce el número de columnas de la matriz de enteros aleatorios");
		int columnas = entrada.nextInt();
		int [][] matriz = new int [filas][columnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*100);	
			}
		}
		entrada.close();
		return matriz;
	}
	public static void mostrarMatriz2D(int [][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void mostrarMatriz2D(double [][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		EntradaSalidaArrays.mostrarArray1D(EntradaSalidaArrays.leerRealesArray1D());
		EntradaSalidaArrays.mostrarArray1D(EntradaSalidaArrays.leerEnterosArray1D());
		EntradaSalidaArrays.mostrarArray1D(EntradaSalidaArrays.inicializarEnterosArray1D());
		EntradaSalidaArrays.mostrarArray1D(EntradaSalidaArrays.inicializarRealesArray1D());
		EntradaSalidaArrays.mostrarMatriz2D(EntradaSalidaArrays.leerEnterosMatriz2D());
		EntradaSalidaArrays.mostrarMatriz2D(EntradaSalidaArrays.inicializarEnterosMatriz2D());
	}
}
