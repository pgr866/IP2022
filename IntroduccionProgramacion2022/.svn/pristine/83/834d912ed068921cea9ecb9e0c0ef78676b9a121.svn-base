package org.ip.tema01.ejemplostema;

public class TestSobrecargaMetodos {
	/** Devuelve el maximo entre dos valores enteros */
	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	/** Devuelve el maximo entre dos valores reales */
	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
	/** Devuelve el maximo entre tres valores reales */
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

	public static void main(String[] args) {
		System.out.println("El maximo entre 3 y 4 es " + max(3, 4));
		System.out.println("El maximo entre 3.0 y 5.4 es " + max(3.0, 5.4));
		System.out.println("El maximo entre 10.7, 3.8 y 5.1 es " + max(10.7, 3.8, 5.1));
	}
}
