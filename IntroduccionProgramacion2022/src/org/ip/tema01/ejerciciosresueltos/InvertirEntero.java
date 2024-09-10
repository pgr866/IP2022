package org.ip.tema01.ejerciciosresueltos;

import java.util.Scanner;

public class InvertirEntero {
  
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un valor entero");
		int valor = entrada.nextInt();
		if (valor == 0) {
			System.out.print("El entero " + valor + " invertido es " + valor);
		}
		else if (valor > 0) {
			System.out.print("El entero " + valor + " invertido es ");
			mostrarInverso(valor);
		}
		else {
			System.out.print("El entero " + valor + " invertido es -");
			mostrarInverso(-valor);
		}
		entrada.close();
	}

	public static void mostrarInverso(int valor) {
		if (valor != 0) {
			System.out.print(valor % 10);
			valor = valor / 10;
			mostrarInverso(valor);
		}
	}
}
